package Proyecto_I;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terminos_Condiciones extends JFrame implements ActionListener, ChangeListener{
    private JLabel titulo, label_imagen;
    private JTextArea texto;
    private JScrollPane scroll;
    private JCheckBox Aceptar;
    private JButton continuar, no_acepto;
    String nombre = "";


    public Terminos_Condiciones(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Terminos y Condiciones");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        Bienvenida ventana_bienvenida = new Bienvenida();
        nombre = ventana_bienvenida.texto_v;

        titulo = new JLabel("TERMINOS Y CONDICIONES");
        titulo.setBounds(215,5,200,30);
        titulo.setFont(new Font("Andale Mono", Font.BOLD, 14));
        titulo.setForeground(new Color(0,0,0));
        add(titulo);

        texto = new JTextArea();
        texto.setEditable(false);
        texto.setFont(new Font("Andale Mono",0, 9));
        texto.setText("\n\n          TERMINOS Y CONDICIONES " +
                "\n\n          A. PROHIBIDA LA VENTA O DISTRIBUCION SIN PREVIA AUTORIZACION DE THE COCA-COLA COMPANY." +
                "\n          B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS ITERFACES.");
        scroll = new JScrollPane(texto);
        scroll.setBounds(10,40,570,200);
        add(scroll);

        Aceptar = new JCheckBox("Yo " + nombre + " Acepto");
        Aceptar.setBounds(10,250,300,30);
        Aceptar.addChangeListener(this);
        add(Aceptar);

        continuar= new JButton("Continuar");
        continuar.setBounds(10,290,100,30);
        continuar.addActionListener(this);
        continuar.setEnabled(false);
        add(continuar);

        no_acepto = new JButton("No acepto");
        no_acepto.setBounds(120,290,100,30);
        no_acepto.addActionListener(this);
        add(no_acepto);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/coca-cola.png"));
        label_imagen = new JLabel(imagen);
        label_imagen.setBounds(290,150,300,300);
        add(label_imagen);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==continuar){
            principal pantalla = new principal();
            pantalla.setBounds(0,0,700,600);
            pantalla.setVisible(true);
            pantalla.setResizable(false);
            pantalla.setLocationRelativeTo(null);
            this.setVisible(false);
        }else if(e.getSource()==no_acepto){
            Bienvenida PantallaBienvenida = new Bienvenida();
            PantallaBienvenida.setBounds(0,0,350,450);
            PantallaBienvenida.setVisible(true);
            PantallaBienvenida.setResizable(false);
            PantallaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
    public void stateChanged(ChangeEvent e){
        if(Aceptar.isSelected()){
            continuar.setEnabled(true);
            no_acepto.setEnabled(false);
        }else{
            continuar.setEnabled(false);
            no_acepto.setEnabled(true);
        }
    }
    public static void main(String args[]){
        Terminos_Condiciones pantalla = new Terminos_Condiciones();
        pantalla.setBounds(0,0,600,400);
        pantalla.setVisible(true);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
    }

}
