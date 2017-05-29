/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author leuri
 */
public class Principal extends JFrame{
    
    public Principal(){
        JButton botaoConfirma = new JButton("Enter");
        JButton botaoLimpar = new JButton("Limpar");
        JTextField caixa = new JTextField();
        
        setLayout(new GridLayout(1,3));
        add(caixa);
        add(botaoConfirma);
        add(botaoLimpar);
        setSize(500,100);
        setTitle("Principal");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        botaoConfirma.addMouseListener(new Listernes(caixa));
        botaoLimpar.addActionListener(new Listernes());
        caixa.addKeyListener(new Listernes(caixa));
        
        setVisible(true);
    }
}
