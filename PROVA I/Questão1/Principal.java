/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

/**
 *
 * @author aluno
 */
public class Principal {
     public static void main(String[] args){
         
        Idioma EN = new Idioma("From", "To", "Subject", "Dear", "Sincerely");
        
        Mensagem M1 = new Mensagem("Prof", "Aluno", "Internationalization", "bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh bleh ", EN);
        
        M1.msgCompleta();
     }
}
