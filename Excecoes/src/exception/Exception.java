/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author leuri
 */
public class Exception extends Throwable{

    public Exception(){
        
    }
    
    
    public void mostrarMensagem(){
        JOptionPane.showMessageDialog(null, "Campo Vazio!");
    }
    
    public void exceptionVoid(JTextField text) throws Exception{
        if(text.getText().equals("")){
            throw new Exception();
        }
    }
    
    public void exceptionAge(JTextField text) throws Exception{
       int age = Integer.parseInt(text.getText());
       if(age<0){
           JOptionPane.showMessageDialog(null, "Idade invalida!");
       }
    }
    
    public void exceptionSex(JTextField text)throws Exception{
       if(text.getText().equals("M") || text.getText().equals("F")){
       }else{
           JOptionPane.showMessageDialog(null, "Sexo invalido!");
       }
    }
    
}
