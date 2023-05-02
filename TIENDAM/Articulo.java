package TIENDAM;

public class Articulo {
    Almacen almacen = new Almacen();
    private String nombre;
    private double precio;
    private int cantidad;

    public enum tipoiva {
        General, Reducido, Superreducido
    }

    public tipoiva tipo;
    private double iva;

    public Articulo(String nombre, double precio, double iva, int cantidad) {
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
        this.iva = iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aumentar(int cantidad) {
        for (int i = 0; i < almacen.getIndice(); i++) {
            if ((i + 1) == TienDAM.buscar()) {
                cantidad++;
            } else {
                System.out.println("No hay ningún articulo con ese número");
            }
        }
    }

    public void disminuir(int cantidad) {
        for (int i = 0; i < almacen.getIndice(); i++) {
            if ((i + 1) == TienDAM.buscar()) {
                cantidad--;
            } else {

            }
        }
    }

    public String toString() {
        return "Articulo [nombre= " + nombre + ", precio= " + precio + ", cantidad= " + cantidad + "]";
    }

    public void tipoIVA() {
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
