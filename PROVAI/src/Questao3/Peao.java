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
public class Peao extends Pecas{

    public Peao(String nome, String cor, int y) {
        super(cor, y);
        this.nome = "Peao";
        if("Brancas".equals(cor)){
            this.x = 6;
        }else{
            this.x = 1;
        }
    }
   
    
    @Override
    public void movimentacao(int direcao){
        y = y+1;
    }
}
