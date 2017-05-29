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
public class Principal {
   
    Banco B[] = new Banco[3];
    
    ContaCorrente CC1;
    ContaCorrente CC2 = new ContaCorrente(002,"Bartolomeu",200);

    public Principal() {
        this.CC1 = new ContaCorrente(001,"Joao",200);
    }
}
