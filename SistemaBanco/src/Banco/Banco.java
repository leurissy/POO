package Banco;

/**
 *
 * @author Larissa
 */
public class Banco {
    String Nome;
    int Agencia = 0;

    public Banco() {
        this.Agencia++ ;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }
/*
    
    public void CriarCC(){
        ContaCorrente CC1 = new ContaCorrente(001,"Joao",200);
        ContaCorrente CC2 = new ContaCorrente(002,"Bartolomeu",200);
    }
    
    public void CriarCP(){
        ContaPoupança CP1 = new ContaPoupança(003,"Astolfo");
    }
   */ 
}
