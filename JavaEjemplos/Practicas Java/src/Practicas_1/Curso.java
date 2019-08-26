import javax.swing.*;
import java.awt.event.*;

public class Curso extends JFrame implements ActionListener {
    private JLabel texto;
    private JLabel texto2;
    private JButton Button;
    private JButton num_1;
    private JButton num_2;
    private JButton num_3;

    public Curso() {
        setLayout(null);

        texto = new JLabel("Hola Mundo");
        texto.setBounds(10, 10, 80, 50);
        add(texto);

        texto2 = new JLabel("En espera");
        texto2.setBounds(10, 50, 200, 40);
        add(texto2);

        Button = new JButton("Salir");
        Button.setBounds(10, 300, 100, 30);
        add(Button);
        Button.addActionListener(this);

        num_1 = new JButton("1");
        num_1.setBounds(10,200,100,30);
        add(num_1);
        num_1.addActionListener(this);

        num_2 = new JButton("2");
        num_2.setBounds(150,200,100,30);
        add(num_2);
        num_2.addActionListener(this);

        num_3 = new JButton("3");
        num_3.setBounds(300,200,100,30);
        add(num_3);
        num_3.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Button) {
            System.exit(0);
        }
        if (e.getSource() == num_1){
            texto2.setText("El numero es 1");
        }
        if (e.getSource() == num_2){
            texto2.setText("El numero es 2");
        }
        if (e.getSource() == num_3){
            texto2.setText("El numero es 3");
        }
    }

    public static void main(String args[]) {
        Curso pantalla = new Curso();
        pantalla.setBounds(0, 0, 500, 500);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.setResizable(false);

    }
}



