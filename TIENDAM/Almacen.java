package TIENDAM;

public class Almacen {
    final static int MaxArticulos = 100;
    static Articulo[] articulos = new Articulo[MaxArticulos];
    static int cantidad = 0;

    public static boolean verArticulos() {
        // Bucle que recorre el array y lista los articulos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Articulo nº " + (i + 1));
            System.out.println(articulos[i].toString());
        }
        return true;

    }

    public static boolean buscar() {
        for (int i = 0; i < cantidad; i++) {
            if ((i + 1) == 1) {
                articulos[i].toString();
            }
        }
        return true;
    }

    public static boolean anyadirArticulo() {
        if (cantidad < MaxArticulos) {
            // Crear en la clase TienDAM el Scanner y llamarlo desde está clase
        }
        return false;

    }

    public static boolean quitarArticulo(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            if ((i + 1) == 1) {
                return true;
            }
            cantidad--;
        }
        System.out.println("No hay un articulo con ese número");
        return false;
    }

    public static boolean ModificarPrecio(int cantidad, int precio) {
        for (int i = 0; i < cantidad; i++) {
            if ((i+1) == 1) {
                //Crear con Scanner una nueva variable para modificar el precio
                //En TienDAM
            }
        }
        return false;
    }

    public static boolean recibir(int cantidad, int precio) {
        return false;
    }

    public static boolean devolver(int cantidad, int precio) {
        return false;
    }
}
