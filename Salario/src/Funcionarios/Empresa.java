/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author larissa
 */
public class Empresa {
    
    private Gerente gerente;
    ArrayList<Vendedor> ListaVendedores;
    private ArrayList<Operario> ListaOperarios;
    
    public Empresa(){
        this.gerente = new Gerente();
        this.ListaVendedores = new ArrayList<Vendedor>();
        this.ListaOperarios = new ArrayList<Operario>();
    }
    
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
        JOptionPane.showMessageDialog(null,"Gerente adicionado com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void addVendedor(Vendedor vendedor){
        this.ListaVendedores.add(vendedor);
        JOptionPane.showMessageDialog(null,"Vendedor adicionado com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void addOperario(Operario operario){
        this.ListaOperarios.add(operario);
        JOptionPane.showMessageDialog(null,"Operario adicionado com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void removerVendedor(String nome){
        for(Vendedor aux: this.ListaVendedores){
            if(aux.getNome().equals(nome)){
                this.ListaVendedores.remove(aux);
            }
        }
    }
    
    public void removerOperario(String nome){
        for(Operario aux: this.ListaOperarios){
            if(aux.getNome().equals(nome)){
                this.ListaOperarios.remove(aux);
            }
        }
    }
    
    public double calcularFaturamento(){
        double result = 0;
        
        for(Vendedor aux: this.ListaVendedores){
            result += aux.getVendas();
        }        
        return(result);
    }
    
}
