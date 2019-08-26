public class Recursividad {

    public static void main(String args[]){

        int res = fibonacci(8);
        System.out.println(res);

        int lon = longitud("Hola");
        System.out.println(lon);

    }

    static int fibonacci(int x){
        if(x==1){
            return 1;
        }
        if(x==0){
            return 0;
        }else{
            return  fibonacci(x-1) + fibonacci(x-2);
        }
    }
    static int longitud(String x){
        int i = 0;
        return longitud_aux(x,i);
    }
    static int longitud_aux(String x, int i){
        System.out.println(x);
        if(i==x.length()){
            return 0;
        }else{
            return 1 + longitud_aux(x, i+1);
        }
    }

}
