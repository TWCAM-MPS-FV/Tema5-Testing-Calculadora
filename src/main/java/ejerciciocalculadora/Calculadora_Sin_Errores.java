
package ejerciciocalculadora;

public class Calculadora_Sin_Errores {

	public int Suma(int[] sumandos) {
		int suma = 0;
		for (int i = 0; i < sumandos.length; i++) { // Se recorre el arreglo desde la posición 0 en vez de la 1
			suma = suma + sumandos[i]; // Se suma lo acumulado + el contenido del arreglo.
		}
		return suma;
	}

	public int Resta(int[] elementos) {
		int resta = 0;
		for (int i = 0; i < elementos.length; i++) {
			if (i == 0) {
				resta = elementos[i];
			} else {
				resta = resta - elementos[i]; // Se resta el contenido del arreglo - lo acumulado
			}
		}
		return resta;
	}

	public float Division(int m, int n) {
		return m / n;
	}

	public double Multiplicacion(double[] factores) {
		double producto = 1;
		for (int i = 0; i < factores.length; i++) {
			producto *= factores[i];
		}
		return producto;
	}

	public int Factorial(int num) {
		int factorial = 1;
		while (num != 0) {
			factorial = factorial * num; // Se va multiplicando del numero mayor al menor
			num--;
		}
		return factorial;
	}
}