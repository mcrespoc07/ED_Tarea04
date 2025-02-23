package inventario;

import java.util.ArrayList;

/**
 * Clase que representa un inventario de productos.
 * Permite almacenar una lista de productos, agregarlos y mostrarlos.
 *  
 * @author Remedios Crespo
 * @version 1.0
 * @since 2024-02-22
 */
public class Inventario {
    
    // Lista que almacena todos los productos del inventario
    public ArrayList<Producto> listaProductos;
    
    /**
     * Constructor que inicializa la lista de productos.
     */
    public Inventario() {
        listaProductos = new ArrayList<>();
    }
    
    /**
     * Agrega un nuevo producto a la lista de inventario.
     *
     * @param p El objeto Producto que se desea agregar.
     */
    public void agregar(Producto p) {
        listaProductos.add(p);
    }
    
    /**
     * Muestra toda la información de los productos almacenados
     * en el inventario con nombre, precio y stock.
     */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }
    
    /**
     * Método principal.
     * Crea un inventario, agrega algunos productos y los muestra.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Crea una instancia del inventario
        Inventario inventario = new Inventario();
        // Crea productos usando el método de fábrica
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);
        
        // Agrega productos al inventario
        inventario.agregar(p1);
        inventario.agregar(p2);
        
        // Muestra todos los productos
        System.out.println("Inventario de productos:");
        inventario.mostrar();

       
    }
}