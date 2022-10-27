package ejerciciocalculadora;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class Calculadora_Con_ErroresTest {

	Calculadora_Con_Errores calculadora;

	@BeforeEach
	void setUp() throws Exception {
		calculadora = new Calculadora_Con_Errores();
	}

	@AfterAll
	public static void liberar() {
	}

	@Test
	@Order(1)
	public void crearInstancia() {
		Assertions.assertNotNull(calculadora);
	}

	@Test
	@Order(2)
	void testSuma() {
		int[] numeros = { 1, 2 };
		Assertions.assertEquals(3, calculadora.Suma(numeros));
	}

	@Test
	@Order(3)
	void testResta() {
		int[] numeros = { 2, 1 };
		Assertions.assertEquals(1, calculadora.Resta(numeros));
	}

	@Test
	@Order(4)
	void testDivision() {
		Assertions.assertEquals(2, calculadora.Division(4, 2));
	}

	@Test
	@Order(5)
	void testMultiplicacion() {
		double[] numeros = { 2, 2 };
		Assertions.assertEquals(4, calculadora.Multiplicacion(numeros));
	}

	@Test
	@Order(6)
	void testFactorial() {
		Assertions.assertEquals(6, calculadora.Factorial(3));
	}

}
