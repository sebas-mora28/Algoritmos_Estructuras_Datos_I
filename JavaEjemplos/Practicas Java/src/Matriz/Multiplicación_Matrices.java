package Matriz;

public class Multiplicación_Matrices {

    public static void main(String[] args){

        int[][] matrizUno = new int[2][3];
        int[][] matrizDos = new int[3][2];
        int[][] resultado = new int[2][2];


        System.out.println("Primera parada");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                matrizUno[i][j] = (int)(Math.random() *5);
            }
        }

        System.out.println("Segunda parada");
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                matrizDos[i][j] = (int)(Math.random()*5);
            }
        }

        System.out.println("Tercera parada");
        int temporal =0;
        for(int x=0; x<2;x++){
            System.out.println("xd");
            for(int y=0; y<2; y++){
                for(int i=0; i<2; i++ ){
                    System.out.println("Hola");
                    for(int j=0; j<3; j++){
                        temporal += matrizUno[i][j] + matrizDos[j][i];
                    }
                }
                resultado[x][y] = temporal;
            }
        }


        for(int i=0; i<2; i++){
            System.out.println("");
            for(int j=0; j<2; j++){
                System.out.print("[" + resultado[i][j] + "]" );
            }
        }
    }
}
