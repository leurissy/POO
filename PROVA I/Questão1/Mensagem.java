/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

/**
 *
 * @author aluno
 */
public class Mensagem {
    String remetente;
    String destinatario;
    String assunto;
    String corpo;
    Idioma idioma;

    public Mensagem(String remetente, String destinatario, String assunto, String corpo, Idioma idioma) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
        this.idioma = idioma;
    }
    
    public String getRemetente() {
        return remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getCorpo() {
        return corpo;
    }

    public Idioma getIdioma() {
        return idioma;
    }
    
    public void cabecalho(){
        System.out.println(idioma.getDe()+": "+getRemetente());
        System.out.println(idioma.getPara()+": "+getDestinatario());
        System.out.println(idioma.getAssunto()+": "+getAssunto());
        System.out.println("\n");
        System.out.println(idioma.getQuerido()+" "+getDestinatario()+", ");
    }
    
    public void corpoMsg(){
        System.out.println("\n");
        System.out.println(getCorpo());
    }
    
    public void rodape(){
        System.out.println("\n");
        System.out.println(idioma.getSinceramente()+",\n"+getRemetente());
    }
    
    public void msgCompleta(){
        cabecalho();
        corpoMsg();
        rodape();
    }
    
    
    
}
