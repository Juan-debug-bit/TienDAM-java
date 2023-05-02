package TIENDAM;

public class Articulo {
    String nombre;
    double precio;
    int cantidad;

    public enum tipoiva {
        General, Reducido, Superreducido
    }

    public static tipoiva tipo;
    private static double iva;

    public Articulo(int indice){
        indice++;
    }
    public Articulo(String nombre, double precio, double iva, int cantidad, int indice) {
        this(indice);
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        Articulo.iva = iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aumentar(int cantidad) {
        for (int i = 0; i < Almacen.indice; i++) {
            if ((i + 1) == TienDAM.buscar()) {
                cantidad++;
            } else {
                System.out.println("No hay ningún articulo con ese número");
            }
        }
    }

    public void disminuir(int cantidad) {
        for (int i = 0; i < Almacen.indice; i++) {
            if ((i + 1) == TienDAM.buscar()) {
                cantidad--;
            } else {

            }
        }
    }

    public String toString() {
        return "Articulo [nombre= " + nombre + ", precio= " + precio + ", cantidad= " + cantidad + "]";
    }

    public static void TipoIVA() {
        String aux = "General";
        switch (tipo) {
            case Reducido:
                aux = "Reducido";
                break;
            case Superreducido:
                aux = "Superreducido";
                break;
            default:
            System.out.println("Tipo de iva invalido");
                break;
        }
        System.out.println("Tipo de iva: " + aux);
    }

}
