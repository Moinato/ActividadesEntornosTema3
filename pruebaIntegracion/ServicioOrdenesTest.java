package tema3_soluciones;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServicioOrdenesTest {

    @Test
    public void testProcesarOrden() {
        ServicioPagos servicioPagos = new ServicioPagos();
        ServicioOrdenes servicioOrdenes = new ServicioOrdenes(servicioPagos);

        // Intentar procesar una orden de 200
        boolean resultado = servicioOrdenes.procesarOrden(200.0);

        // Verificamos que la orden haya sido procesada correctamente
        assertTrue(resultado); 
    }
}

