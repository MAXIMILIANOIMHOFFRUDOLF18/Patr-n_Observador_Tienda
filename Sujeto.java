// Interfaz Sujeto (Tienda)
interface Sujeto {
    void registrarInteres(Cliente cliente, String producto);
    void agregarProducto(String producto);
    boolean estaDisponible(String producto);
}