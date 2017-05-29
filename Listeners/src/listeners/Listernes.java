/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author leuri
 */
public class Listernes implements ActionListener,MouseListener,KeyListener{
    
    public JTextField caixa;
    
    public Listernes(){
        this.caixa = null;
    }
    
    public Listernes(JTextField caixa){
        this.caixa = caixa;
    }
//ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Vc não devia fazer isso");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    //mouse
    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Sua mensagem foi: "+this.caixa.getText());
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    //KeyListerne
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
           if (e.getKeyCode() == KeyEvent.VK_ENTER) {
               JOptionPane.showMessageDialog(null, "Sua mensagem foi: "+this.caixa.getText());
           } 
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
    
}
