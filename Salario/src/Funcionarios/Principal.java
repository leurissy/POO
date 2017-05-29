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
public class Principal {
    public static void main(String[] args){
        
        Funcionario operario = new Operario();
        Funcionario vendedor = new Vendedor();
        Funcionario gerente = new Gerente();
        
        operario.setNome("Operario");
        operario.setSalario(1000);
        
        vendedor.setNome("Vendedor");
        vendedor.setSalario(1200);
        ((Vendedor)vendedor).setVendas(5000);
        
        gerente.setNome("Gerente");
        gerente.setSalario(2000);
        
        System.out.println(operario.getNome()+": R$ "+operario.calcularSalario());
        System.out.println(vendedor.getNome()+": R$ "+vendedor.calcularSalario());
        System.out.println(gerente.getNome()+": R$ "+gerente.calcularSalario());
        
    }
}
