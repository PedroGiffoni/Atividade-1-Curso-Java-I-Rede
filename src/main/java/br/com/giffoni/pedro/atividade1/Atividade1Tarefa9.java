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
public class Atividade1Tarefa9 {
    public void executarTarefa9(){
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Escreva seu nome completo: ");
    String nomeCompleto = ler.nextLine();
    
    int primeiroEspaco = nomeCompleto.indexOf(" ");

        int ultimoEspaco = nomeCompleto.lastIndexOf(" ");

        String primeiroNome =
                nomeCompleto.substring(0, primeiroEspaco);

        String ultimoNome =
                nomeCompleto.substring(ultimoEspaco + 1);

        System.out.println("Primeiro nome: " + primeiroNome);

        System.out.println("Último nome: " + ultimoNome);
    }
}
