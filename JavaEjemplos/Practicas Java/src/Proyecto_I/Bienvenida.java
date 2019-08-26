package Proyecto_I;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {
    private JLabel label_iamgen, nombre_proyecto, nombre, leyenda;
    private JTextField usuario;
    private JButton ingresar;
    public static String texto_v = "";


    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
        label_iamgen = new JLabel(imagen);
        label_iamgen.setBounds(25, 15, 300,150);
        add(label_iamgen);

        nombre_proyecto = new JLabel("Sistema de Control Vacacional");
        nombre_proyecto.setBounds(35,135,300,30);
        nombre_proyecto.setFont(new Font("Andale Mono", Font.BOLD + Font.ITALIC, 18));
        nombre_proyecto.setForeground(new Color(255,255,255));
        add(nombre_proyecto);

        nombre = new JLabel("Ingrese su nombre");
        nombre.setBounds(45,212,200,30);
        nombre.setFont(new Font("Andale Mono", Font.BOLD, 12));
        nombre.setForeground(new Color(255,255,255));
        add(nombre);

        leyenda = new JLabel(" ©2017 The Coca-Cola Company");
        leyenda.setBounds(85,375,300,30);
        leyenda.setFont(new Font("Andale Mono", Font.BOLD, 12));
        leyenda.setForeground(new Color(255,255,255));
        add(leyenda);

        usuario = new JTextField();
        usuario.setBounds(45,240,255,25);
        usuario.setBackground(new Color(254,254,254));
        usuario.setFont(new Font("Andale Mono", Font.BOLD, 14));
        usuario.setForeground(new Color(255,0,0));
        add(usuario);

        ingresar = new JButton("Ingresar");
        ingresar.setBounds(125, 280, 100, 30);
        ingresar.setBackground(new Color(255,255,255));
        ingresar.setFont(new Font("Andale Mono", Font.BOLD, 12));
        ingresar.setForeground(new Color(255,0,0));
        ingresar.addActionListener(this);
        add(ingresar);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==ingresar){
            texto_v = usuario.getText().trim();
            if(texto_v.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");
            }else{
                Terminos_Condiciones pantalla = new Terminos_Condiciones();
                pantalla.setBounds(0,0,600,400);
                pantalla.setVisible(true);
                pantalla.setResizable(false);
                pantalla.setLocationRelativeTo(null);
                this.setVisible(false);

            }

        }
    }
    public static void main(String args[]){
        Bienvenida PantallaBienvenida = new Bienvenida();
        PantallaBienvenida.setBounds(0,0,350,450);
        PantallaBienvenida.setVisible(true);
        PantallaBienvenida.setResizable(false);
        PantallaBienvenida.setLocationRelativeTo(null);
    }
}