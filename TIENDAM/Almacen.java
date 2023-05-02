package TIENDAM;

public class Almacen {

    private final int maxArticulos = 100;
    private Articulo[] articulos = new Articulo[maxArticulos];
    private int indice = 0;

    public Almacen() {

    }

    public int getIndice() {
        return indice;
    }

    public void verArticulos() {
        // Bucle que recorre el array y lista los articulos
        for (int i = 0; i < indice; i++) {
            System.out.println("Articulo nº " + (i + 1));
            articulos[i].toString();

        }
    }

    public boolean buscar() {
        // Bucle que recorre el array y lista los articulos
        for (int i = 0; i < indice; i++) {
            // Creamos if para mostrar el articulo que queremos ver y no listarlos
            if ((i + 1) == TienDAM.buscar()) {
                articulos[i].toString();
            }
        }
        return true;
    }

    public void anyadirArticulo(String nombre, double precio, double iva, int cantidad) {
        if (indice == maxArticulos)
            return;
        Articulo a = new Articulo(nombre, precio, iva, cantidad);
        articulos[indice] = a;
        indice++;
    }

    public boolean quitarArticulo(int indice) {
        for (int i = 0; i < indice; i++) {
            if ((i + 1) == TienDAM.buscar()) {
                return true;
            }
            indice--;
            articulos[indice] = articulos[indice + 1];
        }
        System.out.println("No hay un articulo con ese número");
        return false;
    }

    public boolean modificarPrecio(int cantidad, int precio) {
        for (int i = 0; i < indice; i++) {
            if ((i + 1) == TienDAM.buscar()) {
                // Crear con Scanner una nueva variable para modificar el precio
                // En TienDAM
            }
        }
        return false;
    }

    public boolean recibir(int cantidad, int precio) {
        return false;
    }

    public boolean devolver(int cantidad, int precio) {
        return false;
    }
}
