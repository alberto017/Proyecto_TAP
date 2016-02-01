 
 //Bibliotecas
 import java.awt.FlowLayout;
 import javax.swing.JButton;
 import javax.swing.JCheckBox;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JTextField;
 import javax.swing.WindowConstants;

public class FlowLayout_1{
 
 public static void main(String args[]){
 
    JFrame v = new JFrame();  
    v.getContentPane().setLayout(new FlowLayout());

    JButton boton = new JButton("Boton");
    JTextField campo = new JTextField(10);
    JCheckBox check = new JCheckBox("CheckBox");		
    JLabel etiqueta = new JLabel("Etiqueta");
    
    v.getContentPane().add(boton);
    v.getContentPane().add(campo);	
    v.getContentPane().add(check);	
    v.getContentPane().add(etiqueta);
    
    v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    v.pack();	
    v.setVisible(true);

    }//main

}//class
