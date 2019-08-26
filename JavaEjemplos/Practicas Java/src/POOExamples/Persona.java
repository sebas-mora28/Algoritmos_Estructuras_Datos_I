package POOExamples;

public class Persona {

    // Encapsulamiento
    private String nombre;
    int edad = 0;

    public Persona(String nombre){
        this.nombre = nombre;

    }

    // Overload: Tener dos métodos con el mismo nombre pero con diferente parámetros
    public void decirNombre(){
        System.out.println("Soy " + nombre);
    }

    public void decirNombre(String mensaje){
        System.out.println("Soy " + nombre + mensaje);
    }
}
