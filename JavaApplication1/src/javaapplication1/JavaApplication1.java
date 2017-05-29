/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author arthur
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     CanetaDeTinta c1 = new CanetaDeTinta("Bic","Azul",0.5f);
     
        //c1.SetModelo("Arruda");
        //c1.modelo = "Wosley";
        //c1.SetPonta(0.5f);
        c1.status();
    }
    
}
