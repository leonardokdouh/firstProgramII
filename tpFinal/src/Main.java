import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {


        runner();
    }



    public static void intro() throws InterruptedException {
        System.out.println("Bienvenido, aguarde que el sistema termine de cargar");
        for (int i=1; i<101; i++){
            System.out.print(i+"% ... ");
            if(i%10==0){
                System.out.println();
                Thread.sleep(2000);
            }
        }
        System.out.println("Sistema cargado correctamente");
        Thread.sleep(2000);

        for (int i=1; i<24; i++){
            System.out.println("");
        }
    }


    public static void runner() throws InterruptedException {
        //intro();
        System.out.println("POR FAVOR ELIJA UNA OPCION");
        System.out.println("1 --> PARA INGRESAR AL MENU DE PRODUCTOS");
        System.out.println("2 --> PARA INGRESAR AL MENU DE PERSONAS");
        System.out.println("3 --> PARA SALIR DE LA APP");



        switch (scan.nextInt()){
            case 1:
                System.out.println("Menu de Productos");
                productsMenu();

                break;
            case 2:
                System.out.println("Menu de Personas");
                personsMenu();
                break;
            case 3:
                System.out.println("Gracias por pasar");
                break;
        }

    }

    public static void productsMenu(){
        System.out.println("BIENVENIDO AL MENU DE PRODUCTOS");
        System.out.println("1 --> PARA IMPRIMIR EL MENU DE PRODUCTOS");
        System.out.println("2 --> PARA ELIMINAR UN PRODUCTO");
        System.out.println("3 --> PARA AGREGAR UN PRODUCTO");

        switch (scan.nextInt()){
            case 1:
                System.out.println("Menu de Productos");

                break;
            case 2:
                System.out.println("Menu de Personas");
                break;
            case 3:
                System.out.println("Gracias por pasar");
                break;
        }

    }

    public static void personsMenu(){
        System.out.println("BIENVENIDO AL MENU DE PERSONAS");
        System.out.println("1 --> PARA IMPRIMIR EL REGISTRO DE EMPLEADOS");
        System.out.println("2 --> PARA IMPRIMIR EL REGISTRO DE CLIENTES");
        System.out.println("3 --> PARA AGREGAR UN PRODUCTO");

        switch (scan.nextInt()){
            case 1:
                System.out.println("Menu de Productos");
                break;
            case 2:
                System.out.println("Menu de Personas");
                break;
            case 3:
                System.out.println("Gracias por pasar");
                break;
        }
    }

}