package grasp;

public class Main {
    
    public static void main(String[] args) {
        
        Encomenda E = new Encomenda();
        
        // 01 - Creator
        // Quem deve ser o responsável por criar uma nova instância de cada
        // classe?
        E.AdicionarSalgado("Coxinha", 1.50f, 10, "Queijo");
        E.AdicionarSalgado("Empada", 2f, 5, "Frango");
        E.AdicionarSalgado("Pastel", 1f, 5, "Carne");
        E.AdicionarDoce("Bolo", 20f, 1, "Chocolate");
        //E.AdicionarItem("Bolo", 16f, 1);
        // A classe Encomenda registra as instâncias de itemEncomenda, então
        // é dela a responsabilidade de criar os objetos itemEncomenda.
        // Por sua vez, itemEncomenda é quem possui os objetos do tipo Produto,
        // então cabe a ela criá-los.
        
        // 02 - Information Expert
        // Quem deve ser o responsável pelos valores de cada objeto?
        System.out.printf("Valor total da Encomenda: R$%.2f\n", 
                E.TotalEncomenda()
        );
        // Para calcular o total final, Encomenda não acessa os produtos
        // diretamente, mas sim o campo Subtotal de cada itemEncomenda.
        // Somente itemEncomenda possui acesso a cada objeto Produto e suas
        // quantidades, portanto é dela a responsabilidade de calcular o
        // subtotal.
        
        // 03 - Low Coupling
        // Como manter uma baixa interdependência entre as classes?
        E.AlterarPreco("Empada", 1.75f);
        // Para alterar o preço de determinado Produto, a classe Encomenda não
        // acessa os objetos diretamente, mas sim os objetos do tipo
        // itemEncomenda que, por sua vez, alteram os objetos do tipo Produto.
        
        // 04 - High Cohesion
        // Como manter a complexidade sobre controle?
        E.RemoverItem("Bolo");
        // Cada classe deve permanecer focada em suas atribuições.
        // Por exemplo, a ação de remover um item da lista deve ser da classe
        // Encomenda.
        
        // 05 - Controller
        // Que classe deve ser responsável por receber eventos do sistema?
        cJanelaPrincipal controller = new cJanelaPrincipal(E);
        controller.setVisible(true);
        // Criamos um controller que recebe os dados do usuario pela interface
        // e delega a criação e manipulação dos itens para suas devidas classes.
        
        // 06 - Polymorphism
        // Como tratar alternativas baseadas no tipo?
        Produto a = new Salgado("Coxinha", 1.50f, "Queijo");
        Produto b = new Doce("Bolo", 20f, "Chocolate");
        System.out.printf("Extras: %s, %s\n", a.getExtra(), b.getExtra());
        // Temos como exemplo os produtos acima, que podem ter determinados
        // "extras". Para o Salgado seria o Recheio, e para o Doce seria a
        // cobertura. Como, dependendo de seu tipo, um cálculo diferente pode
        // ser feito para cada extra, usamos de polimorfismo para deixar essa
        // responsabilidade para os tipos específicos.
        
        // 07 - Pure Fabrication
        // Como delegar responsabilidades sem violar "High Cohesion" e Low
        // Coupling", quando o padrão "Information Expert" não é apropriado?
        Net upload = new Net();
        upload.enviar(E);
        // Se, por exemplo, fôssemos adicionar a funcionalidade de transmitir
        // uma Encomenda pela internet, de acordo com o "Information Expert",
        // Encomenda deveria ser responsável pelo envio de seus dados, mas isso
        // implicaria na classe Encomenda com lógica relativa a internet, o que
        // leva ao baixo acoplamento e reuso.
        // Portanto, delegamos esta função a classe fabricada Net, que será
        // responsável somente por isso.
        
        // 08 - Indirection
        // Como desacoplar objetos, possibilitando o baixo acoplamento e
        // mantendo alta possibilidade de reuso?
        System.out.printf("Valor total da Encomenda: R$%.2f\n", 
                E.TotalEncomenda()
        );
        // Seguindo um dos exemplos acima, encontramos indireção, onde
        // itemEncomenda serve de intermediário entre Encomenda e Produto,
        // para a operação TotalEncomenda().
        
        // 09 - Protected Variation
        // Como evitar o impacto de variações entre elementos?
        Produto c = new Salgado("Empada", 2f, "Frango");
        Produto d = new Doce("Mousse", 20f, "Leite Condensado");
        System.out.printf("Extras: %s, %s\n", c.getExtra(), d.getExtra());
        // O exemplo de polimorfismo acima serve como um bom exemplo de
        // Protected Variation. Ao utilizarmos do método abstrato getExtra()
        // da classe Produto, garantimos uma interface bem definida, independente
        // do tipo que herda Produto.
        
    }
    
}
