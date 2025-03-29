import java.util.*;

// Clase Shop (Sujeto)
class Shop implements Sujeto {
    private Map<String, List<Cliente>> clientesPorProducto;
    private Set<String> productosDisponibles;

    public Shop() {
        this.clientesPorProducto = new HashMap<>();
        this.productosDisponibles = new HashSet<>();
    }

    // Registrar interés de clientes en un producto específico
    @Override
    public void registrarInteres(Cliente cliente, String producto) {
        clientesPorProducto.putIfAbsent(producto, new ArrayList<>());
        clientesPorProducto.get(producto).add(cliente);
        System.out.println(cliente.getProductoInteresado() + " ha sido registrado como producto de interés para " + cliente.getNombre());
    }

    // Agregar producto y notificar solo a clientes interesados
    @Override
    public void agregarProducto(String producto) {
        productosDisponibles.add(producto);
        System.out.println("La tienda ha recibido el producto: " + producto);
        notificarClientes(producto);
    }

    // Verifica si un producto está disponible
    @Override
    public boolean estaDisponible(String producto) {
        return productosDisponibles.contains(producto);
    }

    // Notificar a clientes interesados en el producto
    private void notificarClientes(String producto) {
        List<Cliente> clientesInteresados = clientesPorProducto.getOrDefault(producto, new ArrayList<>());
        for (Cliente cliente : clientesInteresados) {
            cliente.actualizar(producto);
        }
    }
}