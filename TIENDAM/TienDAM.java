package TIENDAM;

import java.util.Scanner;

public class TienDAM {
    //Menu
    public int menu (int opcion) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("-------TienDAM---------");
        System.out.println("MARCA UNA OPCIÓN");
        System.out.println();
        System.out.println("1. ALMACEN");
        System.out.println("2. PEDIDO");
        System.out.println("3. SALIR");
        System.out.println();
        System.out.println("-------TienDAM---------");

        opcion= tcl.nextInt();
        return opcion;
    }

    public static boolean opciones(int opciones) {
        boolean salir = false;
        switch (opciones) {
            case 1:
                almacen();
                break;
            case 2: 
                pedido();
                break;
            case 3: // Salir
                salir = salir(salir); // Método Salir
                break;
        }
        return salir;
    }
    public static void almacen() {
        System.out.println("-------TienDAM---------");
        System.out.println();
        System.out.println("1. Ver articulos");
        
    }
    public static void pedido() {

    }
    public static boolean salir (boolean salir) {
        System.out.println("HASTA PRONTO");
        return salir;
    }
}
