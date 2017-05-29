package Funcionarios;

import javax.swing.JTextField;

public class Funcionario {
    
    private String nome;
    private double salario;
    
    public Funcionario(){
        this.nome = "";
        this.salario = 0;
    }
   
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public double calcularSalario(){
        return salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
