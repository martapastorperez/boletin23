
package boletin23;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Metodos {
    JFrame marco=new JFrame("***boletin23***");
    JPanel panel=new JPanel();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JLabel nombre=new JLabel("NOME");
    JLabel contra=new JLabel("PASSWORD");
    JButton premer=new JButton("PREMER");
    JButton limpar=new JButton("LIMPAR");
    
    String[]list={"Elementolista1","Elementolista2","Elementolista3"};
    JList lista=new JList(list);
    JButton boton=new JButton("BOTON");
    JTextArea area=new JTextArea("Area de texto");
    
    
    public void ventana(){
        marco.setSize(700,700);
        marco.setVisible(true);
        
        
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
         panel.add(panel1,BorderLayout.NORTH);
     panel.add(panel2,BorderLayout.CENTER);
        
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    public void crearPanel1(){
       // panel1.setSize(450,450);
        panel1.setBackground(Color.gray);
        panel1.setLayout(null);
        panel1.add(nombre);
        nombre.setBounds(100,50,100,100);
        panel1.add(contra);
        contra.setBounds(100,100,100,100);
        panel1.add(premer);
        
        premer.setBounds(200,200,100,50);
        panel1.add(limpar);
        limpar.setBounds(400,200,100,50);
        panel1.setVisible(true);
    }
    public void crearpanel2(){
        
        panel2.setLayout(null);
        panel2.add(lista);
        lista.setBounds(30,50,200,200);
        panel2.add(boton);
        boton.setBounds(300,150,100,50);
        panel2.add(area);
        area.setBounds(500,70,150,150);
        panel2.setVisible(true);
        
    }
    
    
}
