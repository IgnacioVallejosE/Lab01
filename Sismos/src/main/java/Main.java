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
                    int[] arr1 = new int[70];
                    //llenarArray(arr1);
                    System.out.println("arreglo 1: "+"["+llenarArray(arr1)+"]");
                    validador = 1;
                case 2:

                case 3:

                case 4:

                case 0:
                    System.err.println("gracias, hasta pronto");
                    validador = 1;
                    break;
                default:
                    break;
            }
        }while (validador == 0);
    }

    public static double[] llenarArray(int[] arr){
        System.out.println("se procede a llenar datos");
        double[] equis = new double[10];
        Random rnum = new Random();
        for (int i = 0; i < equis.length; i++) {
            equis[i] = rnum.nextDouble()*9.9+0.0;
            System.out.println(equis[i]);
        }
        return equis;
    }
}
