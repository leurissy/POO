/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomaGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class DemoSoma {
    
    public static void main(String[] args){
        
        int Num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro numero: "));
        int Num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo numero: "));
        
        Soma S = new Soma(Num1, Num2);
        
        int soma = S.SomaNumeros();
        
        JOptionPane.showMessageDialog(null,"A soma eh: "+soma,"Soma de 2 Inteiros",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
