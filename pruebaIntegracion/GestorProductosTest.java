package tema3_soluciones;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GestorProductosTest {

    @Test
    public void testRegistroProducto() {
        BaseDeDatosProductos baseDeDatos = new BaseDeDatosProductos();
        GestorProductos gestorProductos = new GestorProductos(baseDeDatos);

        gestorProductos.registrarProducto("Laptop");

        // Verificar si el producto fue registrado correctamente
        assertTrue(gestorProductos.productoRegistrado("Laptop"));
    }
}

