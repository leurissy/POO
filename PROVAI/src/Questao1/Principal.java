/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

/**
 *
 * @author aluno
 */
public class Principal {
     public static void main(String[] args){
         
        Idioma EN = new Idioma("From", "To", "Subject", "Dear", "Sincerely");
        
        Idioma PT = new Idioma("De", "Para", "Assunto", "Querido", "Sinceramento");
        
        Mensagem M1 = new Mensagem("Prof", "Aluno", "Internationalization", "bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh ", EN);
        
        Mensagem M2 = new Mensagem("Prof", "Aluno", "Internaajfkd", "bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh ", PT);
        
        M1.msgCompleta();
        System.out.println("\n");
        M2.msgCompleta();
     }
}
