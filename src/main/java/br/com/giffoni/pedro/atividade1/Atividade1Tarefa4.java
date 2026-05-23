/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.atividade1;
import java.util.Scanner;
/**
 * imprimir numeros inteiros de 0 a 10
 * @author Pedro
 */
public class Atividade1Tarefa4 {

    public void executarTarefa4()  {
        Scanner ler = new Scanner(System.in);

        System.out.print("Você quer a tabuada de qual número? ");
        int numero = ler.nextInt(); 
        //i = i + 1
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
