/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

/**
 *
 * @author aluno
 */
public class Idioma {
    String de;
    String para;
    String assunto;
    String querido;
    String sinceramente;

    public Idioma(String de, String para, String assunto, String querido, String sinceramente) {
        this.de = de;
        this.para = para;
        this.assunto = assunto;
        this.querido = querido;
        this.sinceramente = sinceramente;
    }
    
    public String getDe() {
        return de;
    }

    public String getPara() {
        return para;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getQuerido() {
        return querido;
    }

    public String getSinceramente() {
        return sinceramente;
    }

}
