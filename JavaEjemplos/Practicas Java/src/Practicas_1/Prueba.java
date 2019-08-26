import javax.swing.*;
import java.awt.event.*;

public class Prueba extends JFrame implements ActionListener{
    private JLabel Nombre;
    private JLabel nombre;
    private JButton Aceptar;
    private JTextField Usuario;

    public Prueba(){
        setLayout(null);

        Nombre = new JLabel("Usuario");
        Nombre.setBounds(10,20,100,30);
        add(Nombre);

        Usuario = new JTextField();
        Usuario.setBounds(150, 20, 150, 30);
        add(Usuario);

        nombre = new JLabel("");
        nombre.setBounds(10,50,300,30);
        add(nombre);

        Aceptar = new JButton("Aceptar");
        Aceptar.setBounds(10,150,100,30);
        add(Aceptar);
        Aceptar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == Aceptar){
            String texto = Usuario.getText();
            setTitle(texto);
            nombre.setText("El nombre es" + texto);
        }

    }
    public static void main(String args[]){
        Prueba pantalla = new Prueba();
        pantalla.setBounds(0,0,500,500);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

    }
}
