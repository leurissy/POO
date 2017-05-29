/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SomaGUI;

/**
 *
 * @author Larissa
 */
public class Soma {
    
    private int num1, num2;

    public Soma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int SomaNumeros(){
        int resultado = num1 + num2;
        return resultado;
    }
    
}
