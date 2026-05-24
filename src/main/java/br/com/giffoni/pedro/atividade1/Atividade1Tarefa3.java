/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.atividade1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Atividade1Tarefa3 {

    public void executarTarefa3() {
        
        Scanner ler = new Scanner (System.in);
        
        int escolhaOperacao;
        
        do {
        
            System.out.println("################CALCTOP##################");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - SAIR");
        
            escolhaOperacao = ler.nextInt();
        
        
            switch (escolhaOperacao){
                case 1:  
                    System.out.println("Digite o primeiro número:");
                    int numero1 = ler.nextInt();
                    System.out.println("Digite o segundo número:");
                    int numero2 = ler.nextInt();
                    System.out.println(numero1 + " + " + numero2 + " = " + ( numero1 + numero2 ));
                break;
                case 2:  
                    System.out.println("Digite o primeiro número:");
                    int numero3 = ler.nextInt();
                    System.out.println("Digite o segundo número:");
                    int numero4 = ler.nextInt();
                    System.out.println(numero3 + " - " + numero4 + " = " + ( numero3 - numero4 ));
                break;
                case 3:  
                    System.out.println("Obrigado pot usar Calctop. até a próxima");
                break;
                default:
                System.out.println("Escolha uma opçao de 1 a 3!");
                        break;
            }            
        } while (escolhaOperacao != 3);
    }
}
