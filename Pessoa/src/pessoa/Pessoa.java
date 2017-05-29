package pessoa;

/**
 *
 * @author Larissa
 */
public class Pessoa {

    private String nome;
    private int identidade;

    public Pessoa(String nome, int identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }//fim do construtor
    
    public String Imprime(){
        return "Nome: "+nome+"\nIdentidade: "+identidade;
    }//fim do método imprime
}//fim da classe
