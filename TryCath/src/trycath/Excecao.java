/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycath;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leuri
 */
public class Excecao {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int array[] = new int[10];
        
        MyException e = new MyException();
        
        try {
            e.dividir(a,b);

        } catch (MyException ex) {
            ex.getMessage();
        }
        
        
    }
    
}
