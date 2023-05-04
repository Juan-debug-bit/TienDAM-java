package TIENDAM;

import java.util.Scanner;

public class TienDAM {
    static Almacen almacen = new Almacen();
    static Scanner tcl = new Scanner(System.in);

    // Método que sirve para buscar el número que solicita el usuario. Será
    // utilizado para facilitar
    // la funcionalidad del stock del almacen y a la hora de que nos hagan un
    // pedido.
    public static void buscar() {
        System.out.println();
        System.out.println("Nombre del articulo que quieres buscar");
        String buscar = tcl.nextLine();
        almacen.buscar(buscar);
    }

    // Método para preguntar al usuario por los datos del nuevo articulo, que será
    // utilizado en añadir articulos
    // de almacen.
    public static void newArticulo() {
        Scanner tcl = new Scanner(System.in);
        System.out.println();
        System.out.println("Nuevo Articulo: ");
        System.out.println();
        System.out.println("Nombre del articulo: ");
        String nombre = tcl.nextLine();
        System.out.println("Precio del articulo: ");
        double precio = tcl.nextDouble();
        System.out.println("IVA: ");
        double iva = tcl.nextDouble();
        System.out.println("Cantidad del articulo: ");
        int cantidad = tcl.nextInt();

        almacen.anyadirArticulo(nombre, precio, iva, cantidad);
    }

    public static void modificar() {
        System.out.println();
        System.out.println("Dime el número del articulo: ");
        int buscar = tcl.nextInt();
        System.out.println("Dime el nuevo precio del articulo: ");
        double newPrecio = tcl.nextDouble();
        almacen.modificarPrecio(buscar, newPrecio);
    }

    public static void quitar() {
        System.out.println();
        System.out.println("Dime el número del articulo: ");
        int buscar = tcl.nextInt();
        almacen.quitarArticulo(buscar);
    }

    public static void recibir() {
        System.out.println();
        System.out.println("Dime el número del articulo: ");
        int buscar = tcl.nextInt();
        System.out.println("Dime la cantidad a añadir: ");
        int newCantidad = tcl.nextInt();
        almacen.recibir(buscar, newCantidad);
    }

    public static void devolver(){
        System.out.println();
        System.out.println("Dime el número del articulo: ");
        int buscar = tcl.nextInt();
        System.out.println("Dime la cantidad a devolver: ");
        int newCantidad = tcl.nextInt();
        almacen.devolver(buscar, newCantidad);
    }
    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        boolean salir = false;
        // Creamos bucle while para hacer el menu principal
        while (!salir) {
            System.out.println("Menu principal");
            System.out.println();
            System.out.println("1. Almacen");
            System.out.println("2. Pedido");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Seleccione una opcion: ");
            int opcion = tcl.nextInt();
            // Creamos un Switch dentro del mismo bucle para escoger una de las tres
            // opciones
            switch (opcion) {
                case 1:
                    // Método Almacen para mostrar el submenu del mismo
                    almacen(tcl);
                    break;
                case 2:
                    // Método Pedido para mostrar el submenu del mismo
                    pedido(tcl);
                    break;
                case 3: // Salir
                    salir = true; // Se creó método booleano para que cuando escojamos la opción 3
                    // Salgamos del programa
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    // Método almacen que funciona mediante un bucle while para mostrar y anotar por
    // pantalla las opciones
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
            // Creamos un Switch dentro del mismo bucle para escoger una de las opciones
            switch (opcion) {
                case 1:
                    // Método ver articulos, sirve para listar los articulos que hay en el almacen
                    almacen.verArticulos();
                    break;
                case 2:
                    // Método buscar, sirve para buscar el articulo deseado
                    // PEDIR UN STRING A BUSCAR POR EJEMPLO "TELE"
                    buscar();
                    // LLAMAR A almacen.buscar("Tele")

                    break;
                case 3:
                    // Método agregar, sirve para añadir un articulo
                    newArticulo();
                    break;
                case 4:
                    // Método quitar, sirve para quitar un articulo
                    // almacen.quitarArticulo(opcion);
                    quitar();
                    break;
                case 5:
                    // Método modificar precio, sirve para cambiar el precio
                    modificar();
                    // almacen.modificarPrecio(opcion, opcion);
                    break;
                case 6:
                    // Método recibir
                    almacen.recibir(opcion, opcion);
                    break;
                case 7:
                    // Método devolver
                    almacen.devolver(opcion, opcion);
                    break;
                case 8:
                    // Se creo variable booleana para volver a atras al menu principal
                    volver = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    // Método Pedido que funciona mediante un bucle while para mostrar y anotar por
    // pantalla las opciones
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
            // Creamos un Switch dentro del mismo bucle para escoger una de las opciones
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
                    // Se creo variable booleana para volver a atras al menu principal
                    volver = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
