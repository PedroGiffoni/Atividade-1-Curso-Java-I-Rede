/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.atividade1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Atividade1 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int opcao = 0;
        
        while (opcao != 11){
            
        
            System.out.println("---- MENU DE ATIVIDADES ----");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Atividade 1");
            System.out.println("2 - Atividade 2");
            System.out.println("3 - Atividade 3");
            System.out.println("4 - Atividade 4");
            System.out.println("5 - Atividade 5");
            System.out.println("6 - Atividade 6");
            System.out.println("7 - Atividade 7");
            System.out.println("8 - Atividade 8");
            System.out.println("9 - Atividade 9");
            System.out.println("10 - Atividade 10");
            System.out.println("11 - Sair");
        
            opcao = ler.nextInt();
        
            switch (opcao){
            case 1: 
                Atividade1Tarefa1 tarefa1 = new Atividade1Tarefa1();
                tarefa1.executarTarefa1();
                break;
            case 2: 
                Atividade1Tarefa2 tarefa2 = new Atividade1Tarefa2();
                tarefa2.executarTarefa2();
                break;
            case 3: 
                Atividade1Tarefa3 tarefa3 = new Atividade1Tarefa3();
                tarefa3.executarTarefa3();
                break;    
            case 4: 
                Atividade1Tarefa4 tarefa4 = new Atividade1Tarefa4();
                tarefa4.executarTarefa4();
                break;      
            case 5: 
                Atividade1Tarefa5 tarefa5 = new Atividade1Tarefa5();
                tarefa5.executarTarefa5();
                break;    
            case 6: 
                Atividade1Tarefa6 tarefa6 = new Atividade1Tarefa6();
                tarefa6.executarTarefa6();
                break;    
            case 7: 
                Atividade1Tarefa7 tarefa7 = new Atividade1Tarefa7();
                tarefa7.executarTarefa7();
                break;
            case 8: 
                Atividade1Tarefa8 tarefa8 = new Atividade1Tarefa8();
                tarefa8.executarTarefa8();
                break;  
            case 9: 
                Atividade1Tarefa9 tarefa9 = new Atividade1Tarefa9();
                tarefa9.executarTarefa9();
                break;   
            case 10: 
                Atividade1Tarefa10 tarefa10 = new Atividade1Tarefa10();
                tarefa10.executarTarefa10();
                break; 
            case 11: 
                System.out.println("Programa encerrado!");
                break;     
            default:
                System.out.println("Escolha uma opção válida!");
                break;
            } 
        }    
        ler.close();   
    }
}
