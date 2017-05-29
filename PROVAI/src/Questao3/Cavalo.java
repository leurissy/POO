/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

/**
 *
 * @author aluno
 */
public class Cavalo extends Pecas{

    public Cavalo(String nome, String cor, int y) {
        super(cor, y);
        this.nome = "Cavalo";
        if("Brancas".equals(cor)){
            this.x = 7;
        }else{
            this.x = 0;
        }
    }
    
    @Override
    public void movimentacao(int x, int y, int w, int z){
        
    }
}
