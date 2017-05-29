/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;

import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class Principal {
    public static void main(String[] args){
        
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a nota 1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a nota 2:"));
        
        Notas n = new Notas(nome, idade, n1, n2);
        
        JOptionPane.showMessageDialog(null,"O nome é "+n.getNome(),"Nome",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"O ano é "+n.ano(),"Ano de nascimento",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"O n1 é "+n.getN1(),"N1",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"O n2 é "+n.getN2(),"N1",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"A media é "+n.Media(),"Media",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
