/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.awt.*; 


import java.awt.BorderLayout;
import java.awt.Container;


import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Random;
import java.awt.Dimension;
import javax.swing.JComponent;
/**
 *
 * @author me
 */
public class DesignPanel extends JPanel {
    
    
    private final Mainframe frame;
    
    public static int width=600;
    public static int height=600;
    public DesignPanel(Mainframe frame){
    this.frame=frame;
    setPrefferedSize(new Dimension(width,height));
    setLayout(null);
    
    
    }
    
    
    public void addAtRandomLocation(JComponent comp) {
        Random rand=new Random();
        int x = rand.nextInt(width);
        
        int y = rand.nextInt(height);
        int w = comp.getPreferredSize().width;
        int h = comp.getPreferredSize().height;
        comp.setBounds(x, y, w, h);
        comp.setToolTipText(comp.getClass().getName());
        this.add(comp);
        frame.repaint();
    }
    
    
    
}
