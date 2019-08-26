package Practicas_1;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String args[]){
        Scanner numero = new Scanner(System.in);

        String name = returnName();

        System.out.println("Hello!" + " "+name);

        System.out.println("Cual numero desea elevar?");
        int num = numero.nextInt();
        int multiplicacion = square(num);
        System.out.println(multiplicacion);
    }

    static String returnName(){
        return "Sebastian";
    }

    static int square(int x){return x*x;}
}
