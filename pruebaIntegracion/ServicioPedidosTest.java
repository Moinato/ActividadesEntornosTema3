package tema3_soluciones;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServicioPedidosTest {

    @Test
    public void testCrearYEnviarPedido() {
        ServicioEnvio servicioEnvio = new ServicioEnvio();
        ServicioPedidos servicioPedidos = new ServicioPedidos(servicioEnvio);

        // Intentar crear y enviar un pedido
        boolean resultado = servicioPedidos.crearYEnviarPedido("Pedido 123");

        assertTrue(resultado);  // Se espera que el resultado sea true si el pedido se envía correctamente
    }
}
