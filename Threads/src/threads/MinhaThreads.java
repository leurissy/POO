/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.ArrayList;

/**
 *
 * @author leuri
 */
public class MinhaThreads extends Thread{

   private String nome;
   
   public MinhaThreads(String nome){
       this.nome = nome;
   }
   
   @Override
   public void run(){
       for (int i = 0; i < 10; i++) {
           System.out.println(this.nome+": "+System.currentTimeMillis());
       }
   }
   
   public static void main(String args[]){
       ArrayList<MinhaThreads> t = new ArrayList<>();
       
       int i;
       for (i = 0; i < 10; i++) {
           t.add(new MinhaThreads(Integer.toString(i)));
       }
       
       for(MinhaThreads aux: t){
           aux.start();
       }
   }
}
