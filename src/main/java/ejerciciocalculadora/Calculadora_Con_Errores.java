
package ejerciciocalculadora;

public class Calculadora_Con_Errores {

	public int Suma(int[] sumandos) {
		int suma = 0;
		for (int i = 1; i < sumandos.length; i++) {
			suma += sumandos[i];
		}
		return suma;
	}

	public int Resta(int[] elementos) {
		int resta = 0;
		for (int i = 0; i < elementos.length; i++) {
			resta += elementos[i];
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
		for (int i = 0; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}
}