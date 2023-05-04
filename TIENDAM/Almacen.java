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
            System.out.print("Articulo nº " + (i + 1) + ": ");
            System.out.println(articulos[i].toString());
            System.out.println();
        }
    }

    // Recorrer el array y mostrar los artículos cuyo nombre contiene txt
    public boolean buscar(String txt) {
        // Bucle que recorre el array y lista los articulos
        for (int i = 0; i < indice; i++) {
            if (articulos[i].getNombre().toLowerCase().contains(txt.toLowerCase())) {
                System.out.println(articulos[i].toString());
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

    public boolean quitarArticulo(int buscar) {
        for (int i = 0; i < indice; i++) {
            articulos[buscar] = articulos[buscar + 1];
        }
        return true;
    }

    public boolean modificarPrecio(int buscar, double precio) {
        buscar -= 1;
        articulos[buscar].setPrecio(precio);
        return true;
    }

    public boolean recibir(int buscar, int cantidad) {
        buscar -= 1;
        cantidad += articulos[buscar].getCantidad();

        articulos[buscar].setCantidad(cantidad);
        return true;
    }
    public boolean devolver(int buscar, int cantidad){
        buscar -=1;
        cantidad-=articulos[buscar].getCantidad();
        articulos[buscar].setCantidad(cantidad);
        return true;
    }
}
