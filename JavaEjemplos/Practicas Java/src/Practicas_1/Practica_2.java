package Practicas_1;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Practica_2 extends JFrame implements ActionListener, ChangeListener{
    private JLabel condiciones;
    private JCheckBox aceptar;
    private JButton continuar;

    public Practica_2(){
        setLayout(null);

        condiciones = new JLabel("Acepto los terminos y condiciones");
        condiciones.setBounds(10,20,200,30);
        add(condiciones);

        aceptar = new JCheckBox("Acepto");
        aceptar.setBounds(10,50,100,30);
        aceptar.addChangeListener(this);
        add(aceptar);

        continuar = new JButton("Continuar");
        continuar.setBounds(10,80,100,30);
        continuar.addActionListener(this);
        add(continuar);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==continuar){
            System.exit(0);
        }

    }
    public void stateChanged(ChangeEvent e){
        if (aceptar.isSelected()==true){
            continuar.setEnabled(true);
        }else{
            continuar.setEnabled(false);
        }
    }

    public static void main(String args[]){
        Practica_2 pantalla = new Practica_2();
        pantalla.setBounds(0,0,400,400);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }

}

