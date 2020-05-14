/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComponent;

/**
 *
 * @author me
 */
public class ControlPanel extends JPanel {

    private final MainFrame frame;
    public JLabel classNameLabel = new JLabel("Class name");
    public JTextField textField = new JTextField();
    public JTextField className=new JTextField(20);
     
    public JButton saveButton = new JButton("Save");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    public void init(){
    add(classNameLabel);
    add(className);
    add(textField);
    add(saveButton);
    
    saveButton.addActionListener(e)
            
            {@Override  
            JComponent component=new JComponent(className.gettext());
            if(component!=null){
    frame.designPanel.addAtRandomLocation(comp);
            }
    }
    
    
    
    }
   public void setComponentText(JComponent component,String text)
   {
   Class class=component.getClass();
           Method method;
           try{
   method=class.getMethod("setText",String.class);
           method.invoke(component,text);
           
   
   }catch(NoSuchMethodException|InvocationTargetException e)
   {e.printStackTrace();}
   
   
   }
  

}
