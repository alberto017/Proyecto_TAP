import javax.swing.*;
import java.awt.*;


class Elias_Ejemplo3 extends JFrame {
	
	public static void main (String []args){
	
		JFrame miFrame = new JFrame( "Ejemplo 3 de flowlayout" );	
		JButton primero = new JButton("Primero");
		JButton anterior = new JButton("Anterior");
 		JButton siguiente = new JButton("Siguiente");
 		JButton ultimo = new JButton("Ultimo");
	
 		//Añadimos el formato de FlowLayout al JFrame
 		miFrame.setLayout(new FlowLayout()); 
 		
		//Añadimos componentes
 		miFrame.add(primero); 
 		miFrame.add(anterior);
 		miFrame.add(siguiente);
 		miFrame.add(ultimo); 
 		miFrame.setSize(400,400);
 		miFrame.setVisible(true);
        }
}	
