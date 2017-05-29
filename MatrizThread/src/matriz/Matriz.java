package matriz;

import java.util.ArrayList;

/**
 *
 * @author leuri
 */
public class Matriz extends Thread{

    
    int m1[][] = new int[4][4];
    int m2[][] = new int[4][4];
    int res[][] = new int [4][4];
    
    public Matriz(){
        
    }
            
    public int valorAleatorio(){
        return new java.util.Random().nextInt(10) + 1;
    }
    
    public void preencherMatrizes(int m[][]){
       for (int i = 0; i < (m.length); i++) {
            for (int j = 0; j < (m.length); j++) {
               m[i][j] = valorAleatorio();
            }
        }
   }
    
    public void setM1(int[][] m1) {
        this.m1 = m1;
    }

    public void setM2(int[][] m2) {
        this.m2 = m2;
    }
    
    public void multMatriz(int m1[][], int m2[][]){
       for (int i = 0; i < ((m1.length)/2); i++) {
           for (int j = 0; j < ((m2[i].length)/2); j++) {
                this.res[i][j] = (m1[i][j] * m2[j][i]) + (m1[i][j] * m2[j][i]);
           }
       }
    }
  
    public void viewMatriz(int m[][]){
       System.out.println("Matriz: ");
       for (int i = 0; i < ((m1.length)/2); i++) {
           for (int j = 0; j < ((m2[i].length)/2); j++) {
                System.out.print(m[i][j]+" ");
           }
           System.out.println(" ");
       }
    }
   
   @Override
   public void run(){
       preencherMatrizes(m1);
       preencherMatrizes(m2);
       viewMatriz(m1);
       viewMatriz(m2);
       multMatriz(m1, m2);
       viewMatriz(res);
   }
    
    public static void main(String[] args) {
       
        Matriz mat = new Matriz();
        
       int m1[][] = new int[4][4];
       int m2[][] = new int[4][4];

       mat.setM1(m1);
       mat.setM2(m2);
       mat.start(); 
        
        
    }
}
