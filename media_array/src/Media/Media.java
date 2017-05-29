package Media;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Larissa
 */
public class Media {
    
    double[] Valores = new double[3];

    public double calcularMedia(){
       Valores[2] = (Valores[0]+Valores[1])/2 ;
       return Valores[2];
    }
    
}
