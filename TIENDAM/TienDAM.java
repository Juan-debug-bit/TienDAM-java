package TIENDAM;

import java.util.Scanner;

public class TienDAM {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("Menu principal");
            System.out.println();
            System.out.println("1. Almacen");
            System.out.println("2. Pedido");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Seleccione una opcion: ");
            int opcion = tcl.nextInt();
                switch (opcion) {
                    case 1:
                        
                    almacen(tcl);
                    break;
                case 2:
                    pedido(tcl);
                    break;
                case 3: // Salir
                    salir = true; 
                    break;
                    default:
                    System.out.println("Opcion invalida");
                }
        }
    }
    public static void almacen(Scanner tcl) {
        boolean volver = false;
        while (!volver) {
            System.out.println("Menu de almacen");
            System.out.println();
            System.out.println("1. Ver articulos");
            System.out.println("2. Buscar articulo");
            System.out.println("3. Agregar articulo");
            System.out.println("4. Quitar articulo");
            System.out.println("5. Modificar precio del articulo");
            System.out.println("6. Recibir articulo");
            System.out.println("7. Devolver articulo");
            System.out.println("8. Volver al menu principal");
            System.out.println();
            System.out.print("Seleccione una opcion: ");
            int opcion = tcl.nextInt();
                switch (opcion) {
                    case 1:
                    Almacen.verArticulos();
                    break;
                case 2:
                    
                    Almacen.buscar();
                    break;
                case 3:
                    
                    Almacen.anyadirArticulo();
                    break;
                case 4:
                    
                    Almacen.quitarArticulo(opcion);
                    break;
                case 5:
                    
                    Almacen.ModificarPrecio(opcion, opcion);
                    break;
                case 6:
                    Almacen.recibir(opcion, opcion);
                    break;
                case 7:
                    Almacen.devolver(opcion, opcion);
                    break;
                case 8:
                    volver = true;
                    break;
                    default:
                    System.out.println("Opcion invalida");
                }
        }
    }
    public static void pedido(Scanner tcl) {
        boolean volver = false;
        while (!volver) {
            System.out.println("Menu de pedido");
            System.out.println();
            System.out.println("1. Añadir articulo al carrito");
            System.out.println("2. Quitar articulo del carrito");
            System.out.println("3. Modificar cantidad de un articulo del carrito");
            System.out.println("4. Aplicar descuento");
            System.out.println("5. Hacer la venta");
            System.out.println("6. Volver al menu principal");
            System.out.print("Seleccione una opción: ");
            int opcion = tcl.nextInt();
                switch (opcion) {
                    case 1:
                        
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:
                        volver = true;
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
        }
    }
}
