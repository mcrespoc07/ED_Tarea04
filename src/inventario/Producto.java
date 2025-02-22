package inventario;

public class Producto {
    private String nombre;
    private double producto;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.producto = precio;
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + producto + " | Stock: " + stock);
    }

    public void borrarDatos() {
        nombre = "";
        producto = 0.0;
        stock = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getProducto() {
        return producto;
    }

    public void setProducto(double producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}