/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Larissa
 */
public class ContaCorrente extends Conta{
    
    int Limite;

    public void setLimite(int Limite) {
        this.Limite = Limite;
    }

    public ContaCorrente(int Conta, String Correntista, int Limite) {
        super(Conta, Correntista);
        this.Limite = Limite;
    }
    
    public void Sacar(double valor){
        if(valor>(Saldo+Limite)){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo:"+getSaldo());
        }
    }
    
    
}
