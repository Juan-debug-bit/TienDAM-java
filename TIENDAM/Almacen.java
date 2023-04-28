package TIENDAM;

public class Almacen {
    final int MaxArticulos=100;
    Articulo [] articulos = new Articulo [MaxArticulos];
    int cantidad;

    public  boolean anyadir (boolean a) {
        return a;
        
    }
    public boolean anyadirArticulo() {
        return false;
    }
    public boolean quitarArticulo(int cantidad) {
        return false;
    }
    public boolean ModificarPrecio (int cantidad, int precio) {
        return false;
    }
    public boolean recibir (int cantidad, int precio) {
        return false;
    }
    public boolean devolver (int cantidad, int precio) {
        return false;
    }
}
