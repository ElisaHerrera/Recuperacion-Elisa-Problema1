import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        while (!salir) {
            System.out.println("1- Encender Impresora");
            System.out.println("2- Apagar Impresora");
            System.out.println("3- Añadir Trabajo");
            System.out.println("4- Ver Lista de Trabajos");
            System.out.println("5- Imprimir");
            System.out.println("Q- Salir");

            switch (userInput) {
                case "1":
                    System.out.println("Encediendo Impresora");
                    break;
                case "2":
                    System.out.println("Apagando Impresora");
                    break;
                case "3":
                    System.out.println("Añadir trabajo");
                    ArrayList<String> MostrarImpresion = new ArrayList<String>(5);
                    MostrarImpresion.add(0, "Imprimiendo");
                    for (int i = 0; i < MostrarImpresion.size(); i++) {
                        System.out.println(MostrarImpresion.get(i));
                    }
                    System.out.println("Rechazando impresion-> " + MostrarImpresion.remove(0));
                    break;
                case "4":
                    System.out.println("Ver lista de trabajos");
                    break;
                case "5":
                    System.out.println("Imprimir");
                    break;
                case "Q":
                    System.out.println("Saliendo de la aplicación...");
                    salir = false;
                    break;
            }
            break;
            }
        }
    }
