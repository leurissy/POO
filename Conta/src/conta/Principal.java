/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class Principal {
    
    public static void main(String[] args) {
       
        int op = -1;
        double valor;
        
        Conta Conta1 = new Conta(123, true, "Jose da Silva", true);
        Conta Conta2 = new Conta(456, false, "Jovenila Souza", true);
        
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Abrir conta\n 2 - Depositar\n 3 - Sacar\n 4 - Saldo \n 5 - Pagar Mensalidade \n 6 - Fechar Conta\n 7 - Dados Conta\n0 - Sair \n"));
            
            switch(op){
                case 1:
                    Conta1.abrirConta();
                   // Conta2.abrirConta();
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor a ser depositado?"));
                    Conta1.depositar(valor);
                    break;
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor a ser sacar?"));
                    Conta1.sacar(valor);
                    break;
                case 4:
                    System.out.println("O Saldo eh:"+Conta1.getSaldo());
                    break;
                case 5:
                    Conta1.pagarMensal();
                    break;
                case 6:
                    Conta1.fecharConta();
                    break;
                case 7:
                    System.out.println("Nome: "+Conta1.getDono()+" Tipo: "+Conta1.isTipo()+" Num.Conta: "+Conta1.getNumConta());
                case 0:
                    break;
                default:
                    System.out.println("Valor invalido");       
            }
        }
        
        
    } 
}
