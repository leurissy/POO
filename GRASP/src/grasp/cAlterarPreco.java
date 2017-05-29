package grasp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class cAlterarPreco implements ActionListener {

    Encomenda encomenda;
    cJanelaPrincipal janela;
    
    public cAlterarPreco(Encomenda e, cJanelaPrincipal j) {
        encomenda = e;
        janela = j;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = (String)JOptionPane.showInputDialog(
                janela,
                "Insira o nome do item a ser alterado:",
                "Alterar Preço",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                null,
                "Coxinha"
        );
        if (nome == null)
            return;
        
        float preco;
        do {
            String p = (String)JOptionPane.showInputDialog(
                janela,
                "Insira o novo preço do item:",
                "Alterar Preço",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                null,
                "3.00"
            );
            if (p == null)
               return;
            try {
                preco = Float.parseFloat(p);
            } catch (Exception exc) {
                preco = -1;
            }
        } while (preco < 0);
        
        encomenda.AlterarPreco(nome, preco);
        janela.AtualizarConteudo();
    }
    
}
