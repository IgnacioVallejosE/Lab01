import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejecutable();
    }

    public static void ejecutable(){
        System.out.println("bienvenidos!");
        mostrarMenu();
        casos();
    }

    private static void mostrarMenu() {
        System.out.println("ingrese una opción:");
        System.out.println("(1)ingresar datos");
        System.out.println("(2)mostrar sismo de mayor magnitud");
        System.out.println("(3)contar sismos mayores a 5.0");
        System.out.println("(4)enviar SMS por cada sismo mayor a 7.0");
        System.out.println("(0)salir");
    }

    public static void casos(){
        Scanner tec = new Scanner(System.in);
        int opcion = tec.nextInt();
        int validador = 0;
        do {
            switch (opcion) {
                case 1:
                    double[] arr1 = new double[70];
                    llenarArray(arr1);
                    mostrarArray(arr1);
                case 2:
                    arr1 = new double[70];
                    mayorSismo(arr1);
                case 3:

                case 4:

                case 0:
                    System.err.println("gracias, hasta pronto");
                    validador = 1;
                    break;
                default: validador = 0;
            }
        }while (validador == 0);
    }

    private static void mayorSismo(double[] arr) {
        double[] sismos = arr;
        double mayor = sismos[0];
        for (int i = 0; i < sismos.length; i++) {
            if (sismos[i]>mayor){
                mayor = sismos[i];
            }
        }
    }

    private static void mostrarArray(double[] arr) {
        double[] mostrar = arr;
        for (int i = 0; i < mostrar.length; i++) {
            System.out.println("["+mostrar[i]+"]");
        }
    }

    public static double[] llenarArray(double[] arr){
        System.out.println("se procede a llenar datos");
        double[] equis = new double[arr.length];
        Random rnum = new Random();
        for (int i = 0; i < equis.length; i++) {
            equis[i] = rnum.nextDouble()*9.9+0.0;
            System.out.println(equis[i]);
        }
        return equis;
    }
}
