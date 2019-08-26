package Singleton;

public class Persona {

    private static Persona instancia;

    private Persona(){}

    public static Persona getPersona(){
        if(instancia == null){
            instancia = new Persona();
        }
        return instancia;
    }

    public void message(){
        System.out.println("Esto es un ejemplo de Singleton");
    }
}
