/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.atividade1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Atividade1Tarefa6 {
    
    public void executarTarefa6() {
        
    Scanner ler = new Scanner(System.in);
    
    String[] nomes = {"Maria", "João", "Carlos", "Ana", "Beatriz"};
    
    System.out.println(" Digite um nome: ");
    String nomeDigitado = ler.nextLine();
    
    boolean encontrado = false;
    
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equalsIgnoreCase(nomeDigitado)){
                encontrado = true;
                break;
            }
            
        }
        if(encontrado) {
            System.out.println("O nome " + nomeDigitado + "  está na lista!");
        }else{
            System.out.println("O nome " + nomeDigitado + " não está na lista!");
        }
    
    
    }
    
}
