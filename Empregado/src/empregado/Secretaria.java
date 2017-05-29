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
public class Secretaria extends Empregado {
    
    int i;
    String[] contatos;

    public Secretaria(String nome, double salario, int ano) {
        super(nome, salario, ano);
        contatos = new String[5];
    }
    
    public void anotar(String nome){
        if(contatos.length<5){
            for(i=0; i<contatos.length; i++){
                if(contatos[i]==null){
                    contatos[i] = nome;
                }
            }
        }else{
            for(i=0; i<contatos.length-1; i++){
                contatos[i] = contatos[i+1];
            }
            contatos[i] = nome;
        }
    }
    
    public void imprimirAgenda(){
        for(i=0; i<contatos.length; i++){
                System.out.println(i+" - "+contatos[i]);
            }
    }
    
}
