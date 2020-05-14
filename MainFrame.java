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

public class MainFrame extends JFrame {

    DesignPanel designPanel
    ControlPanel controlPanel;
    //Random rand=new Random();
    //int height=this.getHeight();
    //int width=this.getWidth();

    public MainFrame() {
        super("My Drawing Application");
        this.setLayout(new BorderLayout());
        rootPane.setPreferedSize(new Dimension())
        init();
        addComponents();
        this.setVisible(true);
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //create the components
        designPanel = new DesignPanel(this);
        
        controlPanel = new COntrolPanel(this);

        
        
       
        //invoke the layout manager
        pack();
    }
    
    public void addComponents(){
     this.add(controlPanel, BorderLayout.NORTH);
        this.add(designPanel, BorderLayout.SOUTH);

    }
}
