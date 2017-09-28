/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

/**
 *
 * @author Larissa
 */
public class Militar {
    int matricula;
    String patente;

    public Militar(int matricula, String patente) {
        this.matricula = matricula;
        this.patente = patente;
    }

    public void imprimirDados(){
        System.out.println("Matricula: "+matricula+"\nPatente: "+patente+"\n");
    }
    
    public void progredir(){
        
    }
}
