package TIENDAM;

public class Articulo {
    final String nombre;
    double precio;
    final double iva;
    int cantidad;

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aumentar (int cantidad) {
        for (int i = 0; i < Almacen.cantidad; i++) {
            if ((i+1) == 1) {
                cantidad = cantidad + cantidad;//Aqui tengo que solicitar la cantidad en TienDAM
            }else{
                System.out.println("No hay ningún articulo con ese número");
            }
        }
    }

    public void disminuir (int cantidad) {
        for (int i = 0; i < Almacen.cantidad; i++) {
            if ((i+1) == 1) {
                cantidad = cantidad - cantidad;//Aqui tengo que solicitar la cantidad en TienDAM
            } else {
                
            }
        }
    }
    public String toString() {
        return "Articulo [nombre= " + nombre + ", precio= " + precio + ", iva= " + iva + ", cantidad= " + cantidad + "]";
    }
    

}
