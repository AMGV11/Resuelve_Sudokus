// Clase reservada para el metodo resolverSudoku, el cual ira
// construyendo la matriz solucion del Sudoku a resolver
public class Resolver  
	{
	// Variable declarada para llevar la cuenta de las llamadas recursivas
	static int contador = 1;
	
	public static boolean resolverSudoku(int[][] tablero, int n, boolean traza)
	{	
		// En la declaracion de los enteros fila y col tienen
		// valor -1 debido a que si fuera 0 o 1 daria problemas
		// al trabajar con la matriz del Sudoku
		int fila = -1;
		int col = -1;
		
		// Declaramos la variable vacio para saber cuando quedan
		// huecos libres en el Sudoku
		boolean vacio = true;
		// Bucle para comprobar si queda algun espacio libre en la matriz
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (tablero[i][j] == 0)
				{
					fila = i;
					col = j;

					vacio = false;
					
					break;
				}
			}
			if (!vacio) {
				break;
			}
		}

		// Si no quedan espacios libres, devolvemos true
		if (vacio)
		{
			return true;
		}

		// Bucle para ver si el camino elegido es factible o no
		for (int num = 1; num <= n; num++)
		{
			if (Factible.esFactible(tablero, fila, col, num))
			{
				tablero[fila][col] = num;
				if (resolverSudoku(tablero, n,traza))
				{
					
					return true;
				}
				else
				{	
					// Condicional para saber si se ha activado la opción para mostrar
					// las trazas de las llamadas recursivas
					if(traza) 
						{
						System.out.println("Llamada recursiva Nº" + contador);
						System.out.println("Variable fila=" + fila);
						System.out.println("Variable columna=" + col);
						System.out.println("variable numero=" + num+"\n");
						contador++;
					}
					// Si el camino que hemos seguido comprobamos que no va a llegar
					// a la solucion, utilizamos la vuelta atras (backtrack) y lo 
					// volvemos a intentar
					tablero[fila][col] = 0;
				}
			}
		}
		return false;
	}
	
}
