package javavisualizador;

/*---- PROYECTAZO PARA ETS ----*/
import javavisualizador.gui.CuadroPrincipal;
public class JavaVisualizador {
    public static void main(String[] args) { 
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new CuadroPrincipal().setVisible(true);
            }
        });
        }
}

