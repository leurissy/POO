/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

/**
 *
 * @author larissa
 */
public class Contexto {
    
    private static final Contexto c = new Contexto();

    private Contexto() {
    
    }
    
    private Empresa Emp = new Empresa();

    public static Contexto getC() {
        return c;
    }

    public Empresa getEmp() {
        return Emp;
    }
    
}
