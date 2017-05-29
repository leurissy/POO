/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bool;

import java.util.Random;

/**
 *
 * @author Larissa
 */
public class Bool {
    
    int i;
    int cont = 0;
    boolean[] Ar = new boolean[10];
    
    public void preencherVetor(){       
        Random gerador = new Random();
        for(i=0; i<10; i++){            
            Ar[i]= gerador.nextBoolean();            
            System.out.println(Ar[i]);
        }
    }
    
    public void trueorfalse(){
      for(i=0; i<10; i++){            
            if(Ar[i]==true){
                cont++;
            }
       }
       System.out.println("\n goTtal de Trues: "+cont);
    }
    
}
