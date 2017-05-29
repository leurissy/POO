
package pkginterface;

import java.awt.event.*;
import javax.swing.*;

public class JanelaSimples {

    public JanelaSimples(){
        final JButton botaoLimpa = new JButton("Limpar");//botao
        final JTextField campoTexto = new JTextField(10);//texto
        final JFrame janela = new JFrame("Janela SImples");//janela
        janela.setSize(300,100);
        
        JPanel painel = new JPanel(); //adiciona componentes
        painel.add(botaoLimpa);
        painel.add(campoTexto);
        janela.getContentPane().add(painel);
        
        //Qnd o usuario clicar no botao, limpa o campo de tex
        
        botaoLimpa.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                campoTexto.setText("");
            }
        });
        
        janela.setVisible(true);
    
}
}