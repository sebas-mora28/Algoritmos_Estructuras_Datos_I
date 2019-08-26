import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Practica_3 extends JFrame implements ChangeListener{
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;

    public Practica_3(){
        setLayout(null);

        bg = new ButtonGroup();

        radio1 = new JRadioButton("680*480");
        radio1.setBounds(10,30,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);

        radio2 = new JRadioButton("800*600");
        radio2.setBounds(10,60,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);

        radio3 = new JRadioButton("1020*720");
        radio3.setBounds(10,90,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);

    }
    public void stateChanged(ChangeEvent e){
        if(radio1.isSelected()) {
            setSize(680, 480);
        }
        if(radio2.isSelected()){
            setSize(800,600);
        }
        if(radio3.isSelected()){
            setSize(1020,720);
        }
    }
    public static void main(String args[]){
        Practica_3 pantalla = new Practica_3();
        pantalla.setBounds(0,0,400,400);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
