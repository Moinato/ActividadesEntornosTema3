package tema3_soluciones;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServicioUsuarioTest {

    @Test
    public void testRegistroUsuario() {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        ServicioUsuarios servicioUsuarios = new ServicioUsuarios(baseDeDatos);

        servicioUsuarios.registrarUsuario("Carlos");

        assertTrue(servicioUsuarios.usuarioRegistrado("Carlos"));
    }
}

