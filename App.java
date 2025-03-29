// Clase principal para probar la simulación
public class App {
    public static void main(String[] args) {
        Shop tienda = new Shop();

        // Registro de clientes interesados en productos específicos
        Cliente cliente1 = new Cliente("Maxi", "Laptop Acer", tienda);
        Cliente cliente2 = new Cliente("Yami", "Iphone", tienda);
        Cliente cliente3 = new Cliente("Emilio", "Laptop Samsung", tienda);

        // Simular chequeo diario de disponibilidad
        System.out.println("Simulación de chequeo diario:");
        cliente1.chequearDisponibilidad();
        cliente2.chequearDisponibilidad();
        cliente3.chequearDisponibilidad();

        // Se agregan productos y se notifican solo a clientes interesados
        tienda.agregarProducto("Laptop Acer");
        tienda.agregarProducto("Tablet");
        tienda.agregarProducto("Iphone");

        // Simular chequeo diario después de que llegaron productos
        System.out.println("Chequeo diario después de la llegada de productos:");
        cliente1.chequearDisponibilidad();
        cliente2.chequearDisponibilidad();
        cliente3.chequearDisponibilidad();
    }
}