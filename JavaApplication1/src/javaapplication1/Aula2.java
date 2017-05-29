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
public class Aula2 {
    
    public static void main (String[] args){
        CanetaDeTinta c1 = new CanetaDeTinta();
        
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampado = false;
      
    }
    
     void MetodoTampar(){
      this.c1.tampado = true;  
    }
    
    void MetodoDestampar(){
        this.c1.tampado = false;
    }
    
    void MetodoRabiscar(){
      if(tampado == true){
           System.out.println("ERRO");
     }else{
           System.out.println("Rabisco"); 
        }
    }
}
