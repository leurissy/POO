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
public class Principal {
    
    public static void main(String[] args) {
        /*Instanciação Secretaria e Gerente*/
        Secretaria Secretaria = new Secretaria("Lucia", 1000, 2005);
        Gerente Gerente = new Gerente("Joao", 10000, 2005);
        
        Gerente.setSecretaria(Secretaria);
        
        /*Instanciação Subordinados/Empregados*/
        Empregado[] Empregados = new Empregado[2];        
        
        Empregados[0] = new Empregado("Jose", 900, 2015);
        Empregados[1] = new Empregado("Lucas", 900, 2015);
        
        Gerente.setSubordinado(Empregados);
        
        Gerente.Secretaria.mostrarDados();
        Gerente.Subordinado[0].mostrarDados();
        Gerente.Subordinado[1].mostrarDados();
        
        /*Metodo AumentarSalario*/
        Gerente.aumentarSalario(100, 1);
        Gerente.aumentarSalario(120, 2);        
        Gerente.aumentarSalario(500);
        
        Gerente.Subordinado[0].mostrarDados();
        Gerente.Subordinado[1].mostrarDados();
        Gerente.Secretaria.mostrarDados();
        
        /*Anotar Agenda Secretaria*/
        Gerente.Secretaria.anotar("Felipe");
        Gerente.Secretaria.anotar("Pedro");
        Gerente.Secretaria.anotar("Otavio");
        Gerente.Secretaria.anotar("Bruna");        
        Gerente.Secretaria.imprimirAgenda();
        
        Gerente.Secretaria.anotar("Cara1");        
        Gerente.Secretaria.imprimirAgenda();
        
        Gerente.Secretaria.anotar("Cara2");
        Gerente.Secretaria.imprimirAgenda();
        
        
    }
    
}
