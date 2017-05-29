/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;


/**
 *
 * @author Larissa
 */
public class Notas {
    
    String nome;
    int idade;
    int n1;
    int n2;
    float media;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public Notas(String nome, int idade, int n1, int n2) {
        this.nome = nome;
        this.idade = idade;
        this.n1 = n1;
        this.n2 = n2;
        this.media = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int ano(){
        return 2017-idade;
    }
    
    public float Media(){
        return(n1+n2)/2;
    }
}
