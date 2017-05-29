/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author Larissa
 */
public class Gerente extends Empregado{
    
    Secretaria Secretaria;
    Empregado[] Subordinado;

    public Gerente(String nome, double salario, int ano) {
        super(nome, salario, ano);
        Subordinado = new Empregado[2];
    }
    
    public void setSecretaria(Secretaria Secretaria) {
        this.Secretaria = Secretaria;
    }
   
    public void setSubordinado(Empregado[] Subordinado) {
        this.Subordinado = Subordinado;
    }
    
    public Secretaria getSecretaria() {
        return Secretaria;
    }

    public void aumentarSalario(double aumento, int sub){
          Subordinado[sub-1].aumentarSalario(aumento);
    }
    
    @Override
    public void aumentarSalario(double aumento){
          Secretaria.aumentarSalario(aumento);
    } 
}
