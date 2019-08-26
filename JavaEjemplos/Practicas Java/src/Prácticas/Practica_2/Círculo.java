package Prácticas.Practica_2;

public class Círculo extends Dimensiones_figura {

    @Override
    public int calcular_area() {
        int i = (int) (3.14 * (getRadio()^2));
        return i;

    }

    public void area_círculo() {
        System.out.println("Ingrese el radio");
        int radio = dato.nextInt();
        setRadio(radio);
        System.out.println("El area del círculo es " + calcular_area());
    }
}
