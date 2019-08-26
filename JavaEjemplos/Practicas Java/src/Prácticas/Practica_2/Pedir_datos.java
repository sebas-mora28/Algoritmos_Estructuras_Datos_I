package Prácticas.Practica_2;

import java.util.Scanner;

public class Pedir_datos {
    private Scanner dato = new Scanner(System.in);

    public void elegir_figura() {
        System.out.println("-----------------------------");
        System.out.println("Ingrese la figura deseada");
        System.out.println("1. Círculo \n" +
                "2. Rectángulo \n" +
                "3. Triángulo");

        int figura_elegida = dato.nextInt();
        pedir_datos(figura_elegida);

    }


    public void pedir_datos(int figura) {
        if (figura == 1) {
            Círculo circulo = new Círculo();
            circulo.area_círculo();
            circulo.calcular_area();
        }
        if (figura == 2) {
            Rectángulo rectángulo = new Rectángulo();
            rectángulo.area_rectangulo();
            rectángulo.calcular_area();
        }
        if (figura == 3) {
            Triángulo triángulo = new Triángulo();
            triángulo.area_triangulo();
            triángulo.calcular_area();
        }
    }
}