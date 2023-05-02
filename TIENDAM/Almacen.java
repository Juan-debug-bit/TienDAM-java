package TIENDAM;

public class Almacen {
    final static int MaxArticulos = 100;
    static Articulo[] articulos = new Articulo[MaxArticulos];
    static int indice = 0;

    public static int getIndice() {
        return indice;
    }

    public static void verArticulos() {
        // Bucle que recorre el array y lista los articulos
        for (int i = 0; i < indice; i++) {
            System.out.println("Articulo nº " + (i + 1));
            articulos[i].toString();
            
        }
    }

    public static boolean buscar() {
        // Bucle que recorre el array y lista los articulos
        for (int i = 0; i < indice; i++) {
            //Creamos if para mostrar el articulo que queremos ver y no listarlos
            if ((i + 1) == TienDAM.buscar()) {
                articulos[i].toString();
            }
        }
        return true;
    }

    public static void anyadirArticulo() {
        if (indice < MaxArticulos) {
            //Llamamos al método NewArt que creamos en la clase TienDAM
            TienDAM.newArt();
        }
    }

    public static boolean quitarArticulo(int indice) {
        for (int i = 0; i < indice; i++) {
            if ((i + 1) == TienDAM.buscar()) {
                return true;
            }
            indice--;
            articulos[indice] = articulos[indice+1];
        }
        System.out.println("No hay un articulo con ese número");
        return false;
    }

    public static boolean ModificarPrecio(int cantidad, int precio) {
        for (int i = 0; i < indice; i++) {
            if ((i+1) == TienDAM.buscar()) {
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
