// Clase encargada de comprobar si el camino elegido es factible y puede llevar
// a una solución del Sudoku
public class Factible 
	{
	public static boolean esFactible(int[][] tablero,int fila, int col,int num) {
		
		// Bucle para comprobar la fila indicada y que no coincide ningun numero
		for (int d = 0; d < tablero.length; d++)
		{ 
			// Comprobamos si el numero que intentamos pasar
			// esta presente en esa misma linea.
			// Si es asi, devolvemos false
			if (tablero[fila][d] == num) {
				return false;
			}
		}

		// Bucle para comprobar la columna indicada y que no coincide ningun numero
		for (int r = 0; r < tablero.length; r++)
		{
			
			// Comprobamos si el numero que intentamos pasar
			// esta presente en esa misma columna.
			// Si es asi, devolvemos false
			if (tablero[r][col] == num)
			{
				return false;
			}
		}

		//Comprobamos que en el cuadrado de 3x3 donde esta
		//el numero que queremos pasar, este no esta repetido 
		int sqrt = (int)Math.sqrt(tablero.length);
		int primeraFilaCuadrado = fila - fila % sqrt;
		int primeraColumnaCuadrado = col - col % sqrt;

		for (int r = primeraFilaCuadrado;
			r < primeraFilaCuadrado + sqrt; r++)
		{
			for (int d = primeraColumnaCuadrado;
				d < primeraColumnaCuadrado + sqrt; d++)
			{
				if (tablero[r][d] == num)
				{
					return false;
				}
			} 
		}

		// Si no hay ningun problema, es factible
		return true;
	}
}
