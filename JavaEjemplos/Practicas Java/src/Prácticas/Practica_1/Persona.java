package Prácticas.Practica_1;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String sexo = "H";
    private int peso = 0;
    private int altura = 0;
    private int DNI;

    public Persona(String nombre, int edad, String sexo){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);

    }

    public Persona(String nombre, int edad, String sexo, int peso, int altura){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
