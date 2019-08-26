package Prácticas.Practica_2;

public class Rectángulo extends Dimensiones_figura {
    @Override
    public int calcular_area() {
        return getLargo() * getAncho();
    }

    public void area_rectangulo() {
        System.out.println("Ingrese el valor de la base");
        int base = dato.nextInt();
        setLargo(base);
        System.out.println("Ingrese el valor del ancho");
        int ancho = dato.nextInt();
        setAncho(ancho);
        System.out.println("El area del rectangulo es " + calcular_area());
    }
}
