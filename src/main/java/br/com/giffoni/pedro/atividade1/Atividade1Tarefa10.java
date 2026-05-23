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
public class Atividade1Tarefa10 {
    

    public void executarTarefa10() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String frase = ler.nextLine();

        int quantidadePalavras = 1;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {

                quantidadePalavras++;

            }
        }

        System.out.println("Quantidade de palavras: "
                + quantidadePalavras);

    }
}

