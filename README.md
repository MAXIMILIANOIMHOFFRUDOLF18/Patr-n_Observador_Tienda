# Modelado de una Tienda usando el Patrón Observador

Este proyecto implementa el Patrón Observador en una tienda (**Shop**) donde los clientes pueden registrarse para recibir notificaciones cuando un producto de su interés esté disponible.

## Tecnologías utilizadas
- Lenguaje: **Java**
- Entorno de Desarrollo: Visual Studio Code
- Librerías usadas: java.util (List, Map, Set, HashMap, HashSet, ArrayList)
- Paradigma: **Programación Orientada a Objetos (POO)**
- Patrón de diseño: **Observador (Observer Pattern)**

## Descripción del Proyecto
El sistema tiene las siguientes clases e interfaces:

### **Clases:**
1. **Cliente** (Observador):
   - Representa un cliente interesado en un producto específico.
   - Se registra en la tienda para recibir notificaciones cuando su producto de interés esté disponible.
   - Implementa la interfaz `Observador`.

2. **Shop** (Sujeto):
   - Almacena una lista de productos disponibles.
   - Lleva un registro de clientes interesados en cada producto.
   - Notifica a los clientes cuando un producto de su interés llega a la tienda.
   - Implementa la interfaz `Sujeto`.

### **Interfaces:**
1. **Observador:**
   - Contiene el método `actualizar(String producto)` que debe ser implementado por la clase `Cliente` para recibir notificaciones.

2. **Sujeto:**
   - Define los siguientes métodos para manejar la lista de observadores y notificarles:
     - `registrarInteres(Cliente cliente, String producto)`
     - `agregarProducto(String producto)`
     - `estaDisponible(String producto)`

## Funcionamiento
1. Se crea una instancia de `Shop` (Tienda).
2. Se crean varios clientes (`Cliente`) y se registran en la tienda con un producto de interés.
3. Se simula una verificación diaria donde los clientes revisan si su producto está disponible.
4. Se agregan productos a la tienda, notificando a los clientes interesados.
5. Se vuelve a ejecutar la verificación diaria para comprobar que los clientes recibieron la notificación.

## Ejecución del programa
Para ejecutar el programa, sigue estos pasos:
1. Compila los archivos Java:
   ```sh
   javac App.java Cliente.java Shop.java Observador.java Sujeto.java
   ```
2. Ejecuta el programa:
   ```sh
   java App
   ```

## Ejemplo de salida esperada
```sh
Simulación de chequeo diario:
Maxi: El producto 'Laptop Acer' aún no está disponible. Volveré a revisar más tarde.
Yami: El producto 'Iphone' aún no está disponible. Volveré a revisar más tarde.
Emilio: El producto 'Laptop Samsung' aún no está disponible. Volveré a revisar más tarde.

La tienda ha recibido el producto: Laptop Acer
Notificación para Maxi: El producto 'Laptop Acer' ya está disponible en la tienda.
La tienda ha recibido el producto: Tablet
La tienda ha recibido el producto: Iphone
Notificación para Yami: El producto 'Iphone' ya está disponible en la tienda.

Chequeo diario después de la llegada de productos:
Maxi: ¡Genial! 'Laptop Acer' está disponible en la tienda.
Yami: ¡Genial! 'Iphone' está disponible en la tienda.
Emilio: El producto 'Laptop Samsung' aún no está disponible. Volveré a revisar más tarde.
```

## Contribución
Si deseas mejorar el proyecto, puedes hacer un fork y enviar un pull request con tus mejoras.

## Licencia
Este proyecto está bajo la licencia MIT.

