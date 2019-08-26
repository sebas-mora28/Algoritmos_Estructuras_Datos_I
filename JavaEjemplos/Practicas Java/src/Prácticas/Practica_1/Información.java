package Prácticas.Practica_1;

public class Información extends Persona {

    public Información(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
    }

    public Información(String nombre, int edad, String sexo, int peso, int altura) {
        super(nombre, edad, sexo, peso, altura);
    }


    public void generarReporte(){
        System.out.println("----------- REPORTE INICIAL -------------------");
        System.out.println("Paciente: " + getNombre());
        comprobarSexo();
        System.out.print("En consideración con la altura y pesos dada ");
        calcularIMC();
        System.out.print("De acuerdo con la edad brindada ");
        esMayorDeEdad();
        generarDNI();
        System.out.println("------------- REPORTE FINALIZADO --------------");

    }

    public final void calcularIMC(){
        int IMC = getPeso()/(getAltura()^2);

        if (IMC <20){
            System.out.println("se encuentra debajo del peso ideal");
        }else if(20<=IMC & IMC<=25){
            System.out.println("su peso es el ideal");
        }else if(IMC >25){
            System.out.println("se encuentra sobre su peso ideal");
        }

    }

    public final void esMayorDeEdad(){
        if(getEdad()<= 18){
            System.out.println("la persona es menor de edad");
        }else{
            System.out.println("la persona es mayor de edad");
        }
    }

    private final void comprobarSexo(){
        if(!(getSexo().equals("H") || getSexo().equals("M"))){
            setSexo("H");
        }
    }

    private final void generarDNI(){
        double DNI = 100000000 * Math.random();
        System.out.println(String.format("Su DNI es: %.0f", DNI));


    }
}
