/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giffoni.pedro.atividade1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Atividade1Tarefa7 {
    
    public void executarTarefa7() {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite um número positivo para calcular seu fatorial: ");
    
    long numero = ler.nextInt();
    long fatorial = 1;
        for (long i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }
    System.out.println("Fatorial de " + numero + " = " + fatorial );
    
    } 
    
}
