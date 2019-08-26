import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox extends  JFrame implements ItemListener, ActionListener, ChangeListener {
    private JComboBox caja, color1, color2, color3;
    private JButton fijar;
    private JLabel Rojo, Verde, Azul;
    private JMenuBar Menu;
    private JMenu menu1;
    private JMenuItem Opcion1, Opcion2, Opcion3;
    private JCheckBox O1, O2;

    public ComboBox(){
        setLayout(null);

        Menu = new JMenuBar();
        setJMenuBar(Menu);

        menu1 = new JMenu("Archivo");
        Menu.add(menu1);

        Opcion1 = new JMenuItem("Opciones");
        Opcion1.addActionListener(this);
        menu1.add(Opcion1);

        Opcion2 = new JMenuItem("Edit");
        Opcion2.addActionListener(this);
        menu1.add(Opcion2);

        Opcion3 = new JMenuItem("About");
        Opcion3.addActionListener(this);
        menu1.add(Opcion3);

        caja = new JComboBox();
        caja.setBounds(10,50,100,30);
        add(caja);
        caja.addItem("Rojo");
        caja.addItem("Verde");
        caja.addItem("Amarillo");
        caja.addItem("Azul");
        caja.addItemListener(this);

        Rojo = new JLabel("Rojo");
        Rojo.setBounds(10,100,100,30);
        add(Rojo);
        Verde = new JLabel("Verde");
        Verde.setBounds(10,150,100,30);
        add(Verde);
        Azul = new JLabel("Azul");
        Azul.setBounds(10,200,100,30);
        add(Azul);

        fijar = new JButton("Fijar color");
        fijar.setBounds(70,250,100,30);
        add(fijar);
        fijar.addActionListener(this);

        color1 = new JComboBox();
        color1.setBounds(150,100,100,30);
        add(color1);
        color2 = new JComboBox();
        color2.setBounds(150,150,100,30);
        add(color2);
        color3= new JComboBox();
        color3.setBounds(150,200,100,30);
        add(color3);


        for(int i=0; i<=250; i++){
            color1.addItem(String.valueOf(i));
            color2.addItem(String.valueOf(i));
            color3.addItem(String.valueOf(i));
        }
        color1.addItemListener(this);
        color2.addItemListener(this);
        color3.addItemListener(this);

        O1 = new JCheckBox("Español");
        O1.addChangeListener(this);
        O1.setBounds(10,300,100,50);
        add(O1);


        O2 = new JCheckBox("Ingles");
        O2.addChangeListener(this);
        O2.setBounds(10,330,100,50);
        add(O2);

    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == caja){
            String eleccion = caja.getSelectedItem().toString();
            setTitle(eleccion);
        }
    }
    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();
        if (e.getSource()==fijar){
            String cad1 = color1.getSelectedItem().toString();
            String cad2 = color2.getSelectedItem().toString();
            String cad3 = color3.getSelectedItem().toString();

            int rojo = Integer.parseInt(cad1);
            int verde = Integer.parseInt(cad2);
            int azul = Integer.parseInt(cad3);

            Color  color1 = new Color(rojo, verde, azul);
            fijar.setBackground(color1);
        }
        if(e.getSource()== Opcion1){
            fondo.setBackground(new Color(255,0,0));
        }
        if(e.getSource() == Opcion2){
            fondo.setBackground(new Color(0,255,0));
        }
        if(e.getSource() == Opcion3){
            fondo.setBackground(new Color(0,0,255));
        }
    }
    public void stateChanged(ChangeEvent e){
        String cad = "";
        if (O1.isSelected()==true){
            cad = cad + "Spanish-";
        }
        if (O2.isSelected()==true){
            cad = cad + "English-";
        }
        setTitle(cad);

    }
    public static void main(String args[]){
        ComboBox pantalla = new ComboBox();
        pantalla.setBounds(0,0,700,700);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}

