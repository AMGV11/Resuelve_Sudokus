// Clase encargada de imprimir la matriz solucion del Sudoku y otras ayudas

public class Imprimir  
	{
	public static void imprimirTablero(int[][] tablero, int N) 
	{
		// Una vez que conseguimos resolver el Sudoku y crear la matriz adecuada
		// la imprimimos para terminar
		for (int r = 0; r < N; r++)
		{
			for (int d = 0; d < N; d++)
				{
				System.out.print(tablero[r][d]);
				System.out.print(" ");
				// Tanto esta condicional como la de abajo tienen como objetivo dividir
				// la impresion de la matriz en cuadrados de 3x3 para que sean mas legibles
				if(d%3==2) 
					{
					System.out.print(" ");
				}
			}
		
			if(r%3==2) 
				{
				System.out.println();
			}
			
			System.out.print("\n");
			
			if ((r + 1) % (int)Math.sqrt(N) == 0)
			{
				System.out.print("");
			}
		} 
	}
	// Metodo para imprimir la sintaxis y ayudas con los comandos y argumentos
	public static void imprimirAyuda() 
		{
		System.out.println("SINTAXIS:");									
		System.out.println("Sudoku [-t][-h] [fichero_entrada]");
		System.out.println("-t                Traza las llamadas recursivas"); 
		System.out.println("-h                Muestra esta ayuda");
		System.out.println("fichero_entrada   Tabla inicial del Sudoku\n");
	}
	// Metodo utilizado para comprobar si un argumento es un numero
	public static boolean esNumero(String cadena) {						
        boolean resultado;												

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;    
        }
        return resultado;
	}
}
