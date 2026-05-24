/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.atividade1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Atividade1Tarefa5 {

    public void executarTarefa5() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva uma frase:");
        
        String frase = ler.nextLine();
        
        String novaFrase = frase.replaceAll("(?i)e", "*");
        System.out.println("Resultado: " + novaFrase);
    }
}
