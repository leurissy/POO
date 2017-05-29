/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycath;

/**
 *
 * @author leuri
 */
public class MyException extends Throwable{
     
    public MyException(){
        
    }
    
    public static float dividir(int a ,int b) throws MyException{
        if(b == 0){
            throw new MyException();
        }
        return(a/b);
    }
    
    @Override
    public String getMessage(){
        return "Não é possível dividir por zero!";
    }
}
