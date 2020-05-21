/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.lang.Object;
//import java.beans.Introspector;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.beans.BeanInfo;
import java.beans.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.beans.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
public class Introspector extends Object{
    String ClassName;
    String TheClass;
    public Introspector(ClassName){
    this.ClassName=ClassName;
    
    }
    
    BeanInfo beanInfo = Introspector.getBeanInfo(TheClass.class);
    TheClass instance = (TheClass) Beans.instantiate(
                            Introspector.class.getClassLoader(),
                            beanInfo.getBeanDescriptor()
                                    .getBeanClass()
                                    .getName());
    
     BeanDescriptor bd = beanInfo.getBeanDescriptor();
        System.out.println("class name: " + bd.getName());
        
        System.out.println("class: " + bd.getBeanClass());
        
        for (PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
          
            System.out.println("Property Name: " + pd.getName());
            
            System.out.println("Property Type: " + pd.getPropertyType());
        }
        /*public static BeanInfo getBeanInfo(Class<?> beanClass)
                            throws IntrospectionException, IOException,
                        ClassNotFoundException, InvocationTargetException, IllegalAccessException{}*/
    }
    
    

