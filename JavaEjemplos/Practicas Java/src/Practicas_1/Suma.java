package Practicas_1;
import javax.swing.*;
import java.awt.event.*;

public class Suma extends JFrame implements ActionListener {
    private JTextField num1;
    private JTextField num2;
    private JButton suma;
    private JLabel res;
    private JLabel Valor1;
    private JLabel Valor2;


    public Suma(){
        setLayout(null);

        Valor1 = new JLabel("Valor1");
        Valor1.setBounds(10,50,100,30);
        add(Valor1);

        Valor2 = new JLabel("Valor2");
        Valor2.setBounds(10,100,100,30);
        add(Valor2);

        num1 = new JTextField();
        num1.setBounds(150,50,100,30);
        add(num1);

        num2 = new JTextField();
        num2.setBounds(150,100,100,30);
        add(num2);

        suma = new JButton("Suma");
        suma.setBounds(10,220,100,30);
        add(suma);
        suma.addActionListener(this);

        res = new JLabel("El resultado es: ");
        res.setBounds(150,220,200,30);
        add(res);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==suma){
            int Valor1=0, Valor2=0, resultado=0;
            Valor1 = Integer.parseInt(num1.getText());
            Valor2 = Integer.parseInt(num2.getText());
            resultado = Valor1 + Valor2;
            res.setText("El resultado es: " + resultado);
        }

    }
    public static void main(String args[]){
        Suma pantalla = new Suma();
        pantalla.setBounds(0,0,400,300);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}