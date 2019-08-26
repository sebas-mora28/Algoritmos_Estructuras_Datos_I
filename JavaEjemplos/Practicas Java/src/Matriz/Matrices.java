package Matriz;

import java.util.*;

public class Matrices {

    public static void main(String[] args){

         Matriz();

    }


    /** Listas , Matrices */
    public static void prueba1(){
        // Se le asignan los elementos en el momento de la declaración
        int[] lista = new int[] {1,2,3,6,5};

        for(int i =0; i< lista.length; i++){
            System.out.println("El valor es"  + lista[i]);
        }
    }

    public static void prueba2() {
        // Matriz
        // Se declara el tamaño de la matriz, pero los elementos se asginan después

        int[] lista = new int[5];

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i] == i);
        }
    }

    public static void prueba3(){

        int[] lista = new int[] {5,1,3,6,8};


        // Preguntar como funciona este tipo de for
        for(int i : lista){
            System.out.println(lista[i]);
        }
    }

    public static void prueba4_listas(){

        String[] temp = new String[] {"Pedro", "Juan", "Ana"};

        List<String> lista = new ArrayList<String>();

        for(int i=0; i<temp.length; i++){
            lista.add(temp[i]);
        }

        System.out.println();


        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    public static void prueba5_listasInt(){

            List<Integer> lista = new ArrayList<>();


            for(int i=0; i< 10; i++){
                lista.add(i);
            }

            for(Integer i : lista){
                    System.out.println(i);
            }
    }

    public static void prueba6_listasStrign(){

        String[] string = new String[] {"Pedro", "Juan", "Sebastian", "Alopecio"};

        List<String> lista = new ArrayList<>();

        for(int i=0; i< string.length; i++){
            lista.add(string[i]);
        }

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    /** CONJUNTOS*/

    public static void conjuntos(){
        Set<Integer> conjunto = new HashSet();

        conjunto.add(15);
        conjunto.add(10);
        conjunto.add(35);
        conjunto.add(05);
        conjunto.add(18);

        for(Integer i : conjunto){
            System.out.println(i);
        }
    }

    /** Mapas */

    public static void createmaps(){
        Map<String, Integer> mapa = new HashMap<String, Integer>();

        mapa.put("elemento1", 25);
        mapa.put("elemento2", 39);
        mapa.put("elemento3", 74);

        System.out.println(mapa.get("elemento1"));

        Set<String> keys = mapa.keySet();

        for(String key : keys){
            System.out.println(mapa.get(key));
        }
    }

    public static void Matriz(){

        int[][] matrizUno = new int[5][5];
        int[][] matrizDos = new int[5][5];
        int[][] resultado = new int[5][5];

        for(int i=0; i< matrizUno.length; i++){
            for(int j=0; j< matrizUno.length; j++){
                matrizUno[i][j] = (int) (Math.random() * 5);
            }
        }

        for(int i=0; i< matrizDos.length; i++){
            for(int j=0; j< matrizDos.length; j++){
                matrizDos[i][j] = (int) (Math.random() * 5);
            }
        }


        for(int i=0; i<resultado.length; i++){
            for(int j=0; j<resultado.length; j++){
                resultado[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }


        for(int i=0; i<resultado.length; i++){
            System.out.println();
            for(int j=0; j<resultado.length; j++){
                System.out.print("[" + resultado[i][j] + "]");
            }
        }


    }





}
