/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Media;
import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class Principal {
    
    public static void main(String[] args) {
        
        int op = -1;
        Media M = new Media();
        
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Calcular Media \n 0 - Sair \n"));
            
            switch(op){
                case 1:
                    M.Valores[0] = Double.parseDouble(JOptionPane.showInputDialog("Entre com a primeira nota\n"));
                    M.Valores[1] = Double.parseDouble(JOptionPane.showInputDialog("Entre com a primeira nota\n"));
                    System.out.println("A media eh: "+ M.calcularMedia());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor invalido");       
            }
        }
        
    }
    
}
