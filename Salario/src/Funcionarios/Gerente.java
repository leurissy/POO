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
public class Gerente extends Funcionario{

    public Gerente() {
        super();
    }
  
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    

    public double calcularSalario(double faturamento){
        int aux = (int)(faturamento/100000);
        double bonificacao = (aux*0.2) * super.calcularSalario();        
        return (super.calcularSalario() + bonificacao);
    }
}
