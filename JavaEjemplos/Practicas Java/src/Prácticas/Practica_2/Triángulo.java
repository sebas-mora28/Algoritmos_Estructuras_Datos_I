package Prácticas.Practica_2;

import java.util.Scanner;

public class Triángulo extends Dimensiones_figura {
    private Scanner dato = new Scanner(System.in);

    @Override
    public int calcular_area() {
        return (getAltura() * getAncho()) / 2;
    }

    public void area_triangulo() {
        System.out.println("Ingrese el valor de la altura");
        int altura = dato.nextInt();
        setAltura(altura);
        System.out.println("Ingrese el valor de la base");
        int base = dato.nextInt();
        setAncho(base);
        System.out.println("El area del triangulo " + calcular_area());
    }
}
