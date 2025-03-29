// Clase Cliente (Observador)
class Cliente implements Observador {
    private String nombre;
    private String productoInteresado;
    private Shop tienda;

    public Cliente(String nombre, String productoInteresado, Shop tienda) {
        this.nombre = nombre;
        this.productoInteresado = productoInteresado;
        this.tienda = tienda;
        tienda.registrarInteres(this, productoInteresado);
    }

    public String getProductoInteresado() {
        return productoInteresado;
    }
    public String getNombre() {
        return nombre;
    }

    // Método para simular una visita del cliente a la tienda
    public void chequearDisponibilidad() {
        if (tienda.estaDisponible(productoInteresado)) {
            System.out.println(nombre + ": ¡Genial! '" + productoInteresado + "' está disponible en la tienda.");
        } else {
            System.out.println(nombre + ": El producto '" + productoInteresado + "' aún no está disponible. Volveré a revisar más tarde.");
        }
    }

    @Override
    public void actualizar(String producto) {
        System.out.println("Notificación para " + nombre + ": El producto '" + producto + "' ya está disponible en la tienda.");
    }
}