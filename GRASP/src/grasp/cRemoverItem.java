package grasp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class cRemoverItem implements ActionListener {

    Encomenda encomenda;
    cJanelaPrincipal janela;
    
    public cRemoverItem(Encomenda e, cJanelaPrincipal j) {
        encomenda = e;
        janela = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = (String)JOptionPane.showInputDialog(
                janela,
                "Insira o nome do item a ser removido:",
                "Alterar Preço",
                JOptionPane.PLAIN_MESSAGE,
                null, 
                null,
                "Kibe"
        );
        if (nome == null)
            return;
        
        encomenda.RemoverItem(nome);
        janela.AtualizarConteudo();
    }
    
}
