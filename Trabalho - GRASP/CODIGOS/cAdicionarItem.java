package grasp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class cAdicionarItem implements ActionListener {
    
    Encomenda encomenda;
    cJanelaPrincipal janela;
    
    public cAdicionarItem(Encomenda e, cJanelaPrincipal j) {
        encomenda = e;
        janela = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = (String)JOptionPane.showInputDialog(
                janela,
                "Insira o nome do item a ser adicionado:",
                "Adicionar Item",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                null,
                "Kibe"
        );
        if (nome == null)
            return;
        
        float preco;
        do {
            String p = (String)JOptionPane.showInputDialog(
                janela,
                "Insira o preço do item a ser adicionado:",
                "Adicionar Item",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                null,
                "2.50"
            );
            if (p == null)
               return;
            try {
                preco = Float.parseFloat(p);
            } catch (Exception exc) {
                preco = -1;
            }
        } while (preco < 0);
        
        int qty;
        do {
            String p = (String)JOptionPane.showInputDialog(
                janela,
                "Insira a quantidade do item a ser adicionado:",
                "Adicionar Item",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                null,
                "8"
            );
            if (p == null)
               return;
            try {
                qty = Integer.parseInt(p);
            } catch (Exception exc) {
                qty = -1;
            }
        } while (qty < 0);
        
        String recheio = (String)JOptionPane.showInputDialog(
                janela,
                "Insira o recheio do item a ser adicionado:",
                "Adicionar Item",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                null,
                "Catupiry"
        );
        if (recheio == null)
            return;
        
        encomenda.AdicionarSalgado(nome, preco, qty, recheio);
        janela.AtualizarConteudo();
    }
    
}
