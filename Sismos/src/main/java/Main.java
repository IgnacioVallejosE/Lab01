import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejecutable();
    }

    public static void ejecutable(){
        System.out.println("bienvenidos!");
        mostrarMenu();

    }

    private static void mostrarMenu() {
        Scanner tec = new Scanner(System.in);
        System.out.println("ingrese una opción:");
        System.out.println("(1)mostrar arreglos");
        System.out.println("(2)pares e impares");
        System.out.println("(3)primos");
        System.out.println("(4)modificar");
        System.out.println("(0)salir");
        int opcion = tec.nextInt();
        int validador = 0;
        do {
            switch (opcion) {
                case 1:
                    System.out.println("limite 1:");
                    int[] arr1 = new int[tec.nextInt()];
                    llenarArray(arr1);
                    System.out.println("limite 2:");
                    int[] arr2 = new int[tec.nextInt()];
                    llenarArray(arr2);
                    System.out.println("arreglo 1: "+arr1.toString());
                    System.out.println("arreglo 2: "+arr2.toString());
                    validador = 0;
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

    public static int[] llenarArray(int[] arr){

    }

}
