package Proyecto_I;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class principal extends JFrame implements ActionListener {
    private JMenuBar menu;
    private JMenu menuOpciones, menuCalcular, menuAbout, ColorFondo;
    private JMenuItem miCalculo, Rojo, Negro, Azul, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelApellidoPaterno, labelApellidoMaterno,
    labelDepartameto, labelAntiguedad, labelResultado, labelfooter;
    private JTextField NombreTrabajor, ApellidoPaterno, ApellidoMaterno;
    private JComboBox Departamento, Antiguedad;
    private JScrollPane scroll;
    private JTextArea texto;
    String nombre = "";

    public principal(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        Bienvenida ventana_bienvenida = new Bienvenida();
        nombre = ventana_bienvenida.texto_v;

        menu = new JMenuBar();
        menu.setBackground(new Color(255,0,0));
        setJMenuBar(menu);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono", Font.BOLD, 14));
        menuOpciones.setForeground(new Color(255,255,255));
        menu.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setFont(new Font("Andale Mono", Font.BOLD, 14 ));
        menuCalcular.setForeground(new Color(255,255,255));
        menu.add(menuCalcular);

        menuAbout = new JMenu("About");
        menuAbout.setFont(new Font("Andale Mono", Font.BOLD, 14 ));
        menuAbout.setForeground(new Color(255,255,255));
        menu.add(menuAbout);

        ColorFondo = new JMenu("Color de Fondo");
        ColorFondo.setFont(new Font("Andale Mono", Font.BOLD, 14));
        ColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(ColorFondo);


        // Menu About

        miElCreador = new JMenuItem("Creador");
        miElCreador.setFont(new Font("Andale Mono", Font.BOLD, 14));
        miElCreador.setForeground(new Color(255,0,0));
        miElCreador.addActionListener(this);
        menuAbout.add(miElCreador);

        //Menu Calcular
        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", Font.BOLD, 14));
        miCalculo.setForeground(new Color(255,0,0));
        miCalculo.addActionListener(this);
        menuCalcular.add(miCalculo);

        //Menu Opciones
        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", Font.BOLD, 14));
        miNuevo.setForeground(new Color(255,0,0));
        miNuevo.addActionListener(this);
        menuOpciones.add(miNuevo);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", Font.BOLD, 14));
        miSalir.setForeground(new Color(255,0,0));
        miSalir.addActionListener(this);
        menuOpciones.add(miSalir);

        Rojo = new JMenuItem("Rojo");
        Rojo.setFont(new Font("Andale Mono", Font.BOLD, 14));
        Rojo.setForeground(new Color(255,0,0));
        Rojo.addActionListener(this);
        ColorFondo.add(Rojo);

        Azul = new JMenuItem("Azul");
        Azul.setFont(new Font("Andale Mono", Font.BOLD, 14));
        Azul.setForeground(new Color(255,0,0));
        Azul.addActionListener(this);
        ColorFondo.add(Azul);

        Negro = new JMenuItem("Negro");
        Negro.setFont(new Font("Andale Mono", Font.BOLD, 14));
        Negro.setForeground(new Color(255,0,0));
        Negro.addActionListener(this);
        ColorFondo.add(Negro);

        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(10,35,300,90);
        add(labelLogo);

        labelBienvenido = new JLabel("BIENVENIDO " + nombre);
        labelBienvenido.setBounds(350,60,300,50);
        labelBienvenido.setFont(new Font("Andale Mono", 1,24));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos del trabajor para el cálculo de vacaciones");
        labelTitle.setBounds(75,150,900,25);
        labelTitle.setFont(new Font("Andale Mono", 0,24));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);

        // Campos vacíos

        labelNombre = new JLabel("Nombre completo:");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);

        NombreTrabajor = new JTextField();
        NombreTrabajor.setBounds(25,213,150,25);
        NombreTrabajor.setBackground(new java.awt.Color(224,224,244));
        NombreTrabajor.setFont(new java.awt.Font("Andale Mono", 1,14));
        NombreTrabajor.setForeground(new java.awt.Color(255,0,0));
        add(NombreTrabajor);


        labelApellidoPaterno = new JLabel("Apedillo Paterno:");
        labelApellidoPaterno.setBounds(25,248,180,25);
        labelApellidoPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelApellidoPaterno.setForeground(new Color(255,255,255));
        add(labelApellidoPaterno);

        ApellidoPaterno = new JTextField();
        ApellidoPaterno.setBounds(25,273,150,25);
        ApellidoPaterno.setBackground(new java.awt.Color(224,224,244));
        ApellidoPaterno.setFont(new java.awt.Font("Andale Mono", 1,14));
        ApellidoPaterno.setForeground(new java.awt.Color(255,0,0));
        add(ApellidoPaterno);

        labelApellidoMaterno = new JLabel("Apedillo Paterno:");
        labelApellidoMaterno.setBounds(25,308,180,25);
        labelApellidoMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelApellidoMaterno.setForeground(new Color(255,255,255));
        add(labelApellidoMaterno);

        ApellidoMaterno = new JTextField();
        ApellidoMaterno.setBounds(25,334,150,25);
        ApellidoMaterno.setBackground(new java.awt.Color(224,224,244));
        ApellidoMaterno.setFont(new java.awt.Font("Andale Mono", 1,14));
        ApellidoMaterno.setForeground(new java.awt.Color(255,0,0));
        add(ApellidoMaterno);

        labelDepartameto = new JLabel("Seleccione el departamento");
        labelDepartameto.setBounds(220,188,180,25);
        labelDepartameto.setFont(new Font("Andale Mono", 1, 12));
        labelDepartameto.setForeground(new Color(255,255,255));
        add(labelDepartameto);

        Departamento = new JComboBox();
        Departamento.setBounds(220,213,220,25);
        Departamento.setBackground(new java.awt.Color(224,224,244));
        Departamento.setFont(new java.awt.Font("Andale Mono", 1,14));
        Departamento.setForeground(new java.awt.Color(255,0,0));
        add(Departamento);
        Departamento.addItem("");
        Departamento.addItem("Atencion al cliente");
        Departamento.addItem("Departamento de logistica");
        Departamento.addItem("Departamento de gerencia");


        labelAntiguedad = new JLabel("Seleccione el departamento");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);

        Antiguedad = new JComboBox();
        Antiguedad.setBounds(220,273,220,25);
        Antiguedad.setBackground(new java.awt.Color(224,224,244));
        Antiguedad.setFont(new java.awt.Font("Andale Mono", 1,14));
        Antiguedad.setForeground(new java.awt.Color(255,0,0));
        add(Antiguedad);
        Antiguedad.addItem("");
        Antiguedad.addItem("1 año de servicio");
        Antiguedad.addItem("2 a 6 años de servicio");
        Antiguedad.addItem("7 o mas años de servicio");

        labelResultado = new JLabel("Resultado del calculo");
        labelResultado.setBounds(220,307,180,25);
        labelResultado.setFont(new Font("Andale Mono",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);

        texto = new JTextArea();
        texto.setEditable(false);
        texto.setBackground(new Color(224,224,224));
        texto.setFont(new Font("Andale Mono",1,11));
        texto.setForeground(new Color(255,0,0));
        texto.setText("Aqui aparece el calculo de las vacaciones:");
        scroll = new JScrollPane(texto);
        scroll.setBounds(220,333,385,90);
        add(scroll);

        labelfooter = new JLabel("2017 THE COCA COLA COMPANY | Todos los derechos reservados");
        labelfooter.setBounds(135,500,500,30);
        labelfooter.setFont(new Font("Andale Mono",1,12));
        labelfooter.setForeground(new Color(255,255,255));
        add(labelfooter);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Rojo) {
            getContentPane().setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == Azul) {
            getContentPane().setBackground(new Color(0, 0, 255));
        }
        if (e.getSource() == Negro) {
            getContentPane().setBackground(new Color(0, 0, 0));
        }
        if (e.getSource() == miCalculo) {
            String dato1 = NombreTrabajor.getText();
            String dato2 = ApellidoPaterno.getText();
            String dato3 = ApellidoMaterno.getText();
            String dato4 = Departamento.getSelectedItem().toString();
            String dato5 = Antiguedad.getSelectedItem().toString();

            if (dato1.equals("") || dato2.equals("") || dato3.equals("") || dato4.equals("") || dato5.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes de completar todos los datos");
            } else {
                if (dato5.equals("1 año de servicio")) {
                    System.out.print("Entra aqui");
                    texto.setText("\n El trabajador " + dato1 + " " + dato2 + " " + dato3 +
                            "quien labora en el " + dato4 + "\n con " + dato5 + " " +
                            " recibe 6 dias de vacaciones");
                }
                if (dato5.equals("2 a 6 años de servicio")) {
                    System.out.print("Entra aqui 2");
                    texto.setText("\n El trabajador " + dato1 + " " + dato2 + " " + dato3 +
                            "quien labora en el " + dato4 + "\n con " + dato5 + " "+
                            " recibe 14 dias de vacaciones");
                }
                if (dato5.equals("7 o mas años de servicio")) {
                    System.out.print("Entra aqui 3");
                    texto.setText("\n El trabajador " + dato1 + " " + dato2 + " " + dato3 +
                            " quien labora en el " + dato4 + "\n con " + dato5 + " " +
                            " recibe 20 dias de vacaciones");
                }else{
                    System.out.print("No entra");
                }
            }
        }
            if (e.getSource() == miNuevo) {
                NombreTrabajor.setText("");
                ApellidoMaterno.setText("");
                ApellidoPaterno.setText("");
                Departamento.setSelectedIndex(0);
                Antiguedad.setSelectedIndex(0);

            }
            if (e.getSource() == miSalir) {
                System.exit(0);
            }
            if (e.getSource() == miElCreador) {
                JOptionPane.showMessageDialog(null, "Derradollado por Sebastian Mora \n" + "TECNOLOGICO DE COSTA RICA");

            }

        }
        public static void main (String args[]){
            principal pantalla = new principal();
            pantalla.setBounds(0, 0, 700, 600);
            pantalla.setVisible(true);
            pantalla.setResizable(false);
            pantalla.setLocationRelativeTo(null);
        }
    }