package inventario;


/**
 * Clase que representa un producto dentro de un inventario.
 * Contiene atributos básicos como nombre, precio y stock,
 * así como métodos para gestionar y mostrar información del producto.
 * 
 * @author Remdios Crespo
 * @version 1.0
 * @since 2024-02-22
 */
public class Producto {

    /**
     * Método de fábrica para crear una nueva instancia de Producto.
     * Se utiliza en lugar del constructor directo, ya que éste es privado.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock  Cantidad disponible en stock.
     * @return Devuelve un nuevo objeto Producto con los valores indicados.
     */
    static Producto crearProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }
    
    // Atributos privados que definen las propiedades del producto
    private String nombre;  // Nombre del producto
    private double precio;  // Precio 
    private int stock;      // Cantidad disponible en stock

    /**
     * Constructor privado. No se puede usar desde fuera de la clase.
     * Para crear un producto, hay que usar el método crearProducto()..
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock  Cantidad de stock disponible.
     */

    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Muestra en consola la información del producto, incluyendo nombre,
     * precio y cantidad disponible en stock.
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }
    
    // Getters y Setters
    
    /**
     * Obtiene el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece un nuevo nombre para el producto.
     *
     * @param nombre Nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el precio actual del producto.
     *
     * @return Precio actual del producto.
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Modifica el precio del producto.
     *
     * @param precio Nuevo precio del producto. No debe ser negativo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * Devuelve el stock disponible del producto.
     *
     * @return Cantidad de stock disponible.
     */
    public int getStock() {
        return stock;
    }
    
    /**
     * Modifica la cantidad de stock del producto.
     *
     * @param stock Nueva cantidad de stock.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
