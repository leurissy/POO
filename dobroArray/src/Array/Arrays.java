/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Larissa
 */
public class Arrays {
    int i;
    int[] Ar = new int[10];
    
    public void preencherArray(){       
        for(i=0; i<10; i++){            
            Ar[i]= i*2; 
            
            System.out.println("Posição:"+i+" Valor:"+Ar[i]);
        }
    }
}
