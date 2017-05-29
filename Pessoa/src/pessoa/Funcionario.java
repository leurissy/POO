package pessoa;

/**
 *
 * @author Larissa
 */
public class Funcionario extends Pessoa{
    
    private float salario;
    
    public Funcionario(String nome, int identidade, float sal) {
        super(nome, identidade);
        salario = sal;
    }
    
    @Override
    public String Imprime(){
        String resultado = "";
        resultado = super.Imprime()+"\n"; //chama metodo Imprime da classe pessoa
        return resultado+"Salario: "+salario;
    }// fim do metodo imprimir
    
    final public float qualSalario(){
        return salario;//esse metodo nao pode ser sobreposto
    }//fim do metodo salario
}//fim da classe
