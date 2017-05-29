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
public class CanetaDeTinta {
    
    public String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampado;

    CanetaDeTinta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Rabiscar(){
      if(tampado == true){
           System.out.println("ERRO");
     }else{
           System.out.println("Rabisco"); 
        }
    }
    
    public void Tampar(){
        this.tampado = true;  
    }
    public void Destampar(){
        this.tampado = false;
    }
    
    public String GetModelo(){
        return this.modelo;    
    }
    
    public void SetModelo(String m){
        this.modelo = m;
    }
    
    public float GetPonta(){
        return this.ponta;
    }
    
    public void SetPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("Modelo:"+ this.GetModelo() );
        System.out.println("Ponta:"+ this.GetPonta() );
    }
    public CanetaDeTinta(String m,String c,float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.Tampar();
        
    }
    
}
