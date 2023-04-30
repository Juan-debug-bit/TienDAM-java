package TIENDAM;

public class Almacen {
    final int MaxArticulos = 100;
    Articulo[] articulos = new Articulo[MaxArticulos];
    int cantidad = 0;

    public boolean verArticulos() {
        // Bucle que recorre el array y lista los articulos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Articulo nº " + (i + 1));
            System.out.println(articulos[i].toString());
        }
        return true;

    }

    public boolean buscar() {
        for (int i = 0; i < cantidad; i++) {
            if ((i + 1) == 1) {
                articulos[i].toString();
            }
        }
        return true;
    }

    public boolean anyadirArticulo() {
        if (cantidad < MaxArticulos) {
            // Crear en la clase TienDAM el Scanner y llamarlo desde está clase
        }
        return false;

    }

    public boolean quitarArticulo(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            if ((i + 1) == 1) {
                return true;
            }
            cantidad--;
        }
        System.out.println("No hay un articulo con ese número");
        return false;
    }

    public boolean ModificarPrecio(int cantidad, int precio) {
        for (int i = 0; i < cantidad; i++) {
            if ((i+1) == 1) {
                //Crear con Scanner una nueva variable para modificar el precio
                //En TienDAM
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
