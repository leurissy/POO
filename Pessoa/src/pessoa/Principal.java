package pessoa;

/**
 *
 * @author Larissa
 */
public class Principal {
    public static void main(String[] args) {
        
        //criando um obj da classe Pessoa
        Pessoa p = new Pessoa("Larissa", 18);
        String res = p.Imprime();
        System.out.println(res);
        
        //criando um obj da classe Funcionario
        Funcionario f = new Funcionario("Larissa", 6565, 432.00f );
        System.out.println(f.Imprime());
        float sal = f.qualSalario();
        System.out.println("O Salario: "+sal);
    }
}//fim da classe
