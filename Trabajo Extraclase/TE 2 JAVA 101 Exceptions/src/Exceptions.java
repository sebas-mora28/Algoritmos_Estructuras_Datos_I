import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions {

    private int[][] matriz1 = new int[2][2];
    private int[][] matriz2 = new int[2][2];
    private int[][] resultado = new int[2][2];



    public void ejecutar_suma(){

        try{
            System.out.println("------------------------------------------");
            System.out.println("Ingresa los valores de la primera matriz");
            System.out.println("------------------------------------------");
            pedir_valores(matriz1);
            System.out.println("------------------------------------------");
            System.out.println("Ingresa los valores de la segunda matriz");
            System.out.println("------------------------------------------");
            pedir_valores(matriz2);
            suma_valores();
            imprimir_valores();

        } catch (NumberFormatException e){
            System.out.println("---------------------------------------------");
            System.out.println("Ingresaste una letra o símbolo, empieza nuevamente");
            System.out.println("---------------------------------------------");
            ejecutar_suma();

        }catch (IOException e){
            e.printStackTrace();

        }catch (IllegalArgumentException e){
            System.out.println("---------------------------------------------");
            System.out.println("Ingresaste una número negativo, empieza nuevamente");
            System.out.println("---------------------------------------------");
            ejecutar_suma();
        }
        finally {
            System.out.println();
            System.out.println("Operación terminada" +
                    "");
        }

    }

    public void pedir_valores(int[][] nombre) throws NumberFormatException, IOException, IllegalArgumentException {

        BufferedReader valores = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<nombre.length; i++){
            for(int j=0; j<nombre.length; j++){
                System.out.println("Ingrese un valor");
                int valor = Integer.parseInt(valores.readLine());
                if(valor <0) {
                    throw new IllegalArgumentException();
                }
                nombre[i][j] = valor;


            }
        }

    }

    public void suma_valores(){
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1.length; j++){
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

    }

    public void imprimir_valores() {
        for (int i = 0; i < resultado.length; i++) {
            System.out.println();
            for (int j = 0; j < resultado.length; j++) {
                System.out.print("[" + resultado[i][j] + "]");
            }
        }
    }
}
