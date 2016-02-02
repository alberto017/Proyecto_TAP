import java.awt.*;
import java.awt.event.*;
public class Elias_Ejemplo2 {
    public static void main( String args[] ) {
            
        // Se crea un objeto Button con el texto que se pasa como
        // parametro y el tamaño y posicion indicadas dentro de
        // su contenedor (en pixels)
        Button miBoton1 = new Button( "Boton1" );
        Button miBoton2 = new Button( "Boton2" );
	Button miBoton3 = new Button( "Boton3" );

	// Al rectamgulo se le pasan los parametros: x,y,ancho,alto
	miBoton1.setBounds( new Rectangle( 25,20,50,75 ) );        
	miBoton2.setBounds( new Rectangle( 85,20,50,75 ) );
	miBoton3.setBounds( new Rectangle( 145,20,50,75 ) );
        // Se crea un objeto Frame con el titulo que se indica en la
        //llamada y sin ningun layout
        Frame miFrame = new Frame( "FlowLayout" );
        miFrame.setLayout( null );

        // Añade los dos componentes al Frame, fijando su tamaño en
        // pixels y lo hace visible
        miFrame.add( miBoton1 );
        miFrame.add( miBoton2 );
	miFrame.add( miBoton3 );
        miFrame.setSize( 250,175 );
        miFrame.setVisible( true );
        }
    }
