package Ejercicio1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class PruebasEdad {
	
	//PRUEBAS DE EQUIVALENCIA
	@Test
    public static void testNumerosPositivosEnRango() {
        Edad edad = new Edad();
        boolean resultado= edad.esMayorDeEdad(20);
        assertEquals(true, resultado, "Error en el testeo de un numero positivo");
    }
	@Test
    void testNumerosPositivosFueraDeRango() {
        Edad edad = new Edad();
        boolean resultado= edad.esMayorDeEdad(102);
        assertEquals(false, resultado, "Error en el testeo de un numero positivo fuera de rango");
    }

	@Test
    void testNumerosNegativos() {
        Edad edad = new Edad();
        boolean resultado= edad.esMayorDeEdad(-5);
        assertEquals(false, resultado, "Error en el testeo de un numero negativo");
    }

	@Test
    void testConCero() {
        Edad edad = new Edad();
        boolean resultado= edad.esMayorDeEdad(0);
        assertEquals(false, resultado, "Error con el cero");

    }
	
	//PRUEBAS DE LIMITE
	@Test
    void testMinimoValor() {
        Edad edad = new Edad();
        boolean resultado= edad.esMayorDeEdad(Integer.MIN_VALUE);
        assertEquals(false, resultado, "Error con el mínimo valor");
    }
	@Test
    void testMaxValor() {
        Edad edad = new Edad();
        boolean resultado= edad.esMayorDeEdad(Integer.MAX_VALUE);
        assertEquals(false, resultado, "Error con el máximo valor");
    }
    @Test
    void testSumaDesbordamientoNegativo() {
    	Edad edad = new Edad();
        assertThrows(ArithmeticException.class, () -> edad.esMayorDeEdad(Integer.MIN_VALUE-1), 
            "No se detectó desbordamiento al sumar el mínimo valor con -1");
    }

    @Test
    void testSumaDesbordamientoPositivo() {
    	Edad edad = new Edad();
        assertThrows(ArithmeticException.class, () -> edad.esMayorDeEdad(Integer.MAX_VALUE+1), 
            "No se detectó desbordamiento al sumar el máximo valor con 1");
    }


}


