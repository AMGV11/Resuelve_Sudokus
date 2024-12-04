/**   
   * @autor Antonio Manuel Guisado Valle
   * 
   * @title Resokucion de puzzles Sudoku con algoritmo VA
   * 
   * @describe Resolucion Sudokus:
   * El juego del Sudoku consiste en rellenar un cubo de 9 x 9 celdas dispuestas en 9 subgrupos de 3
   * x 3 celdas, con números del 1 al 9, atendiendo a la restricción de que no se debe repetir el mismo
   * número en la misma fila, columna o subgrupo de 9. Un Sudoku dispone de varias celdas con un
   * valor inicial, de modo que debemos empezar a resolver el problema a partir de esta solución parcial
   * sin modificar ninguna de las celdas iniciales.
*/


public class Sudoku
	{
	// Metodo principal del problema
	public static void main(String args[]) {
		
		// Inicializacion de la matriz tablero, que albergara nuestro Sudoku
		int[][] tablero = new int [9][9] ;
		// Tamaño del tablero
		int N = tablero.length;
		int max = 81;
		String h = "-h", t = "-t";
		// Variable declarada para controlar cuando se quieren las trazas
		boolean traza = false;
		
		// Switch utilizado a modo de seleccion, dependiendo del numero de argumentos y su orden, para llamar
		// apropiadamente a los metodos adecuados. Esta diseñada para que se siga obligatoriamente la sintaxis del programa.
		switch (args.length)
		{
		// Sin argumentos. Al no dar argumentos, solo queda indicar el error y esperar otra incializacion del programa con argumentos validos.
		case 0: 
        		System.out.print("No hay argumentos.");
       		break;
		// Caso para la entrada de un solo argumento
		case 1:
			// Si el argumento es -h, se imprimira en pantalla la ayuda con la sintaxis, comandos y argumentos
			if(args[0].equals(h))
				{
				Imprimir.imprimirAyuda();
				break;
				
			
			}else if(args[0].equals(t))
				{
				System.out.println("No se puede trazar las llamadas recursivas sin una matriz que resolver.");
				break;
			
			}else if(args[0].contains(".txt"))  
				{	
				LectorSudokus.leerSudoku(tablero, args[0]);
			
				// LLamada al metodo para resolver el Sudoku
				if (Resolver.resolverSudoku(tablero, N, traza))
					{
					Imprimir.imprimirTablero(tablero, N);
					break;
				}
				else {
					// Si el Sudoku a resolver no tiene solucion, imprimimos este mensaje
					System.out.println("El Sudoku elegido no tiene solucion");
					break;
				}
				// Caso es especial en el que el argumento que se pasa es una linea de enteros y guiones
				// la cual convertiremos en un Sudoku
			}else if(Imprimir.esNumero(args[0]) && (args[0].length() == max))
					{	
					LectorSudokus.leerCadenaNumeros(tablero, args[0]);
					// LLamada al metodo para resolver el Sudoku
					if (Resolver.resolverSudoku(tablero, N, traza))
						{
						Imprimir.imprimirTablero(tablero, N);
						break;
						
					}else 
						{
						// Si el Sudoku a resolver no tiene solucion, imprimimos este mensaje
						System.out.println("El Sudoku elegido no tiene solucion");
						break;
					}
				
			}else
				{
				System.out.println("El argumento introducido no es valido");
				break;
			}
			
		// Caso para la entrada de dos argumentos
		case 2:
			if(args[0].equals(t)) 
				{
	    		traza=true;	
        	
			}if(args[0].equals(h) || (args[1].equals(h) && args[0].equals(t))) 
    			{   
    			Imprimir.imprimirAyuda();										  
	    	
    		
    		}if(args[1].contains(".txt"))  
			   {	
				LectorSudokus.leerSudoku(tablero, args[1]);
			 
				// LLamada al metodo para resolver el Sudoku
				if (Resolver.resolverSudoku(tablero, N, traza))
					{
					Imprimir.imprimirTablero(tablero, N);
					break;
					
				}else 
					{
					
					System.out.println("El Sudoku elegido no tiene solucion");
					break;
				}
					
			}else if (Imprimir.esNumero(args[1]) && (args[1].length() == max))
						{
						LectorSudokus.leerCadenaNumeros(tablero, args[1]);
					
						if (Resolver.resolverSudoku(tablero, N, traza))
							{
							Imprimir.imprimirTablero(tablero, N);
							break;
							
						}else	 
							{
							System.out.println("El Sudoku elegido no tiene solucion");
							break;
						}
				
			}
			
				System.out.println("Los argumentos introducidos o no son validos o no estan en el orden correspondiente");
				System.out.println("Si tiene alguna duda sobre la sintaxis introduzca -h como argumento");
				
				break;
    	// Caso para la entrada de tres argumentos	
		case 3:
			
			if(args[0].equals(t) && args[1].equals(h) && args[2].contains(".txt"))
				{
				traza=true;
				
				Imprimir.imprimirAyuda();
				
				LectorSudokus.leerSudoku(tablero, args[2]);
				
			
				if (Resolver.resolverSudoku(tablero, N, traza))
					{
					Imprimir.imprimirTablero(tablero, N);
					break;
					
				}else 
					{
					
					System.out.println("El Sudoku elegido no tiene solucion");
					break;
				}
				
		    }else if (Imprimir.esNumero(args[2]) && (args[2].length() == max))
		    	{
		    	LectorSudokus.leerCadenaNumeros(tablero, args[0]);
			
				if (Resolver.resolverSudoku(tablero, N, traza))
					{
					Imprimir.imprimirTablero(tablero, N);
					break;
					
				}else 
					{
					
					System.out.println("El Sudoku elegido no tiene solucion");
					break;
		    	
					}
		    }else
		    	{
		    	System.out.println("Los argumentos introducidos o no son validos o no estan en el orden correspondiente");
				System.out.println("Si tiene alguna duda sobre la sintaxis introduzca -h como argumento");	
		    }
			
			break;
			
		default:
			System.out.println("Se han introducido demasiados argumentos, por favor introduzca argumentos validos");
			break;
	    }
	}
}
