/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntradaDeDados;

import java.util.Scanner;

/**
 *
 * @author Larissa
 */
public class EntradaDeDados {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual seu nome? \n");
        String nome = entrada.nextLine();
        System.out.println("Nome: "+nome+"\n");
        
        System.out.println("Qual sua Idade? \n");
        int idade = entrada.nextInt();
        System.out.println("Idade: "+idade+"\n");
        
        System.out.println("Qual sua Altura? \n");
        float altura = entrada.nextFloat();
        System.out.println("Altura: "+altura+"\n");
        
    }
    
}
