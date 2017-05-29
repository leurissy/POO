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
public class Torres extends Pecas{

    public Torres(String nome, String cor, int y) {
        super(cor, y);
        this.nome = "Torre";
        if("Brancas".equals(cor)){
            this.x = 7;
        }else{
            this.x = 0;
        }
    }
    
}
