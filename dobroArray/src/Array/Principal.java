/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class Principal {
    
     public static void main(String[] args) {
        
        int op = -1;
        Arrays A = new Arrays();
        
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Preencher Vetor \n 0 - Sair \n"));
            
            switch(op){
                case 1:
                    A.preencherArray();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor invalido");       
            }
        }
        
    }
    
}
