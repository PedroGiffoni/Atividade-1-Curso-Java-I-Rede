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
public class Atividade1Tarefa8 {
    
    public void executarTarefa8(){
        
        Scanner ler = new Scanner(System.in);
        
        int opcao = 0;
        
        while(opcao != 3){
        
        System.out.println("###########MENU##########");
        System.out.println("1 - Dizer Olá");
        System.out.println("2 - Dizer Tchau");
        System.out.println("3 - Sair");
        
        opcao = ler.nextInt();
        
        if(opcao ==1){
               System.out.println("Olá");
               
        }else if(opcao ==2){
            System.out.println("Tchau");
            
            }else if (opcao == 3) {
                System.out.println("Saindo do programa...");
                }else{
                    System.out.println("Opção inválida. Escolha um numero de 1 a 3");
                        }
        
            }
        ler.close();
    }
}