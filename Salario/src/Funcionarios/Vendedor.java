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
public class Vendedor extends Funcionario {
    
    private double vendas;
    
    public Vendedor(){
        super();
    }
    
    public Vendedor(double vendas) {
        super();
        this.vendas = vendas;
    }

    public Vendedor(double vendas, String nome, double salario) {
        super(nome, salario);
        this.vendas = vendas;
    }
    
    @Override
    public double calcularSalario(){
        double comissao = this.vendas*0.02;
        return (super.calcularSalario() + comissao);
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getVendas() {
        return vendas;
    }
}
