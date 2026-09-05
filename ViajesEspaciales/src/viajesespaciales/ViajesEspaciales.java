package viajesespaciales;

import java.util.Scanner;

public class ViajesEspaciales {

    public static void main(String[] args) {
        byte opcion = 0;

        Scanner leer = new Scanner(System.in);

        //OBJETOS SUPERCLASE (Naves base)
        
        //constructor 1 porque se conocen todos los datos de la nave (completo)
        NaveEspacial naveBase1 = new NaveEspacial("Pionero I", 120, 2.5, true);

        //constructor 2 porque solo conocemos el nombre y la cantidad de tripulantes (estándar/transporte)
        NaveEspacial naveBase2 = new NaveEspacial("Transportador X", 50);

        //2)CLASES HEREDADAS (Naves exploracion)
        
        //constructor 1 porque se conoce todo el estado actual de la nave exploradora (completo)
        NaveExploracion naveExplo1 = new NaveExploracion("Andromeda", 5000L, 85.5, 'A', "Viajero Astral", 15, 3.0, true);

        //constructor 2 porque solo es necesario especificar 3 datos de la nave (recién construida)
        NaveExploracion naveExplo2 = new NaveExploracion("Buscador Nova", 8, "Via Lactea");

        //Naves Belicas
        //constructor 1 porque se conocen todos los datos del estado actual de la nave (completo)
        NaveBelica naveBelica1 = new NaveBelica("Canion de Iones", 100, 95.5f, 'S', "Destructor Estelar", 300, 2.8, true);

        //constructor 3 porque unicamente es necesario espeficiar 2 datos (vigilancia bajos recursos)
        NaveBelica naveBelica2 = new NaveBelica('B', "Patrullero Delta");

        //Naves de Carga
        //constructor 1 ya que se conocen todos los datos relevantes de la nave (completo)
        NaveCarga naveCarga1 = new NaveCarga("Minerales", 4, 150.5, 'B', "Titan de Carga", 10, 1.5, true);

        //constructor 3 pues la nave esta completamente vacia (sin nada)
        NaveCarga naveCarga2 = new NaveCarga("Carguero Vacio");

        do {
            try {

                System.out.println("\nBIENVENIDO AL SISTEMA DE VIAJES ESPACIALES");

                System.out.println("Seleccione una opcion: ");

                System.out.println("1) Mostrar naves base");
                System.out.println("2) Mostrar naves de exploracion");
                System.out.println("3) Mostrar naves belicas");
                System.out.println("4) Mostrar naves de carga");
                System.out.println("5) Mostrar todas las naves");
                System.out.println("6) Salir");
                opcion = leer.nextByte();
                leer.nextLine();

                System.out.println(); // Salto de línea estético

                switch (opcion) {
                    case 1:
                        System.out.println("\tNAVES BASE:");
                        System.out.println("1)\n" + naveBase1.toString());
                        System.out.println();
                        System.out.println("2)\n" + naveBase2.toString());
                        break;
                    case 2:
                        System.out.println("\tNAVES DE EXPLORACION:");
                        System.out.println("1)\n" + naveExplo1.toString());
                        System.out.println();
                        System.out.println("2)\n" + naveExplo2.toString());
                        break;
                    case 3:
                        System.out.println("\tNAVES BELICAS:");
                        System.out.println("1)\n" + naveBelica1.toString());
                        System.out.println();
                        System.out.println("2)\n" + naveBelica2.toString());
                        break;
                    case 4:
                        System.out.println("\tNAVES DE CARGA:");
                        System.out.println("1)\n" + naveCarga1.toString());
                        System.out.println();
                        System.out.println("2)\n" + naveCarga2.toString());
                        break;
                    case 5:
                        System.out.println("\tTODAS LAS NAVES:");
                        System.out.println("1)\n" + naveBase1.toString());
                        System.out.println();
                        System.out.println("2)\n" + naveBase2.toString());
                        System.out.println();
                        System.out.println("3)\n" + naveExplo1.toString());
                        System.out.println();
                        System.out.println("4)\n" + naveExplo2.toString());
                        System.out.println();
                        System.out.println("5)\n" + naveBelica1.toString());
                        System.out.println();
                        System.out.println("6)\n" + naveBelica2.toString());
                        System.out.println();
                        System.out.println("7)\n" + naveCarga1.toString());
                        System.out.println();
                        System.out.println("8)\n" + naveCarga2.toString());
                        break;
                    case 6:
                        System.out.println("Gracias por usar el sistema :D");
                        break;
                    default:
                        System.out.println("ERROR: Opcion invalida.");

                }
            } catch (Exception e) {
                System.out.println("ERROR: Opcion invalida, ingrese un numero.");
                opcion = 0;
                leer.nextLine();
            }
        } while (opcion != 6);

    }
}
