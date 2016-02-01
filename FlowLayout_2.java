 //Bibliotecas
 import javax.swing.JFrame;
 import java.awt.FlowLayout;
 import javax.swing.JButton;

 public class FlowLayout_2 extends JFrame{
   //Creacion de componentes fuera del constructor
   JButton boton_1 = new JButton("Boton 1");
   JButton boton_2 = new JButton("Boton 2");
   JButton boton_3 = new JButton("Boton 3");
  
   public void FlowLayout_2(){
     //Creacion y asignacion del Layout a nustro JFrame
      setLayout(new FlowLayout(FlowLayout.LEFT));
   
      //Agregar componentes
      add(boton_1);
      add(boton_2);
      add(boton_3);
  
      //Asignar las propiedades de nuestro JFrame(ventana)
       setTitle("FlowLayout_2");
       setSize(700,600);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setVisible(true);
     }//Constructor

    public static void main(String args[]){
    FlowLayout_2 FL = new FlowLayout_2();
  }//main
}//class
