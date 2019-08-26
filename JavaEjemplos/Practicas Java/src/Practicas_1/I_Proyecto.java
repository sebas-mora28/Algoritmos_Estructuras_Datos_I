import javax.swing.*;
import java.awt.*;

public class I_Proyecto extends JFrame{
    private JLabel company_name, nombre, leyenda;
    private JTextField usuario;
    private Font fuente;

    public I_Proyecto(){
        setLayout(null);

        



    }

    public static void main(String args[]){
        I_Proyecto pantalla = new I_Proyecto();
        pantalla.setBounds(0,0,400,600);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
