package inventario;
// Atributos privados

public class Producto {

    private String nombre;
    private double producto;
    private int stock;
// Constructor privado

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.producto = precio;
        this.stock = stock;
    }
// Método de fábrica

    public static Producto crearProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + producto + " | Stock: " + stock);
    }
// Método para borrar datos del producto

    public void borrarDatos() {
        nombre = "";
        producto = 0.0;
        stock = 0;
    }
    // Getters y Setters

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
