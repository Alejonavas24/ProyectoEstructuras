package proyecto_final.com;
import EstructurasDeDatos.ListaEnlazada;
import EstructurasDeDatos.Stack;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {


        System.out.println("Bienvenidos a PetHouse!");
        System.out.println("selecciones una opcion para empezar:");
        System.out.println("1. a");
        System.out.println("2. No se xd");
        System.out.println("3. No se 2" );
        try (Scanner sc = new Scanner (System.in)) {
            int opcion=sc.nextInt();
            if (opcion == 1){
                System.out.println("ola");
            }
        }
    }
}
