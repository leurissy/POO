/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bool;

import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class Principal {
    public static void main(String[] args) {
        
        int op = -1;
        Bool B = new Bool();
        
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Calcular Vetor \n 0 - Sair \n"));
            
            switch(op){
                case 1:
                    B.preencherVetor();
                    B.trueorfalse();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor invalido");       
            }
        }
        
    }
}
