import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Clase utilizara para leer los sudokus que pasas por los argumentos

public class LectorSudokus 
	{
	// Inicializacion de la variable h para detectar los guiones en los 
	// Sudokus de entrada
	private static String h = "-";

	public static void leerSudoku(int tablero[][], String a){
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(a));
			
			//Las siguientes lineas son filas de la matriz
			String linea = br.readLine();
			int fila = 0; //Para recorrer las filas de la matriz
			while(linea != null) {
				
				 // Tenemos todos los enteros juntos en el String linea.
				 // Con split() los separamos en un array donde cada entero
				 // es un String individual. Con un bucle, los pasaremos a tipo int
				 // para guardarlos en la matriz
				String[] enteros = linea.split(" ");
				
				for (int i = 0; i < enteros.length; i++) {
					//Condicional en el que comparamos el dato de entrada diferenciar
					//los numeros de los guiones del sudoku
					if(enteros[i].equals(h)) {
						tablero[fila][i] = 0;
					}else {
						tablero[fila][i] = Integer.parseInt(enteros[i]);
					}
				}
				//Incrementamos fila para la próxima línea de enteros
				fila++; 
				//Leemos siguiente línea
				linea = br.readLine(); 
			}
			//Cerramos el lector de ficheros
			br.close();
 
			//Conjunto de excepciones para este metodo
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra archivo");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("No se pudo convertir a entero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error accediendo al archivo.");
			e.printStackTrace(); 
		}	
	}

	
	public static void leerCadenaNumeros (int tablero [][], String linea) {
		
		int fila = 0; //Para recorrer las filas de la matriz
		while(linea != null) {
			
			String[] enteros = linea.split(" ");
			
			for (int i = 0; i < enteros.length; i++) {

				if(enteros[i].equals(h)) {
					tablero[fila][i] = 0;
					
				}else {
					tablero[fila][i] = Integer.parseInt(enteros[i]);
				}
			}
			//Incrementamos fila para la próxima línea de enteros
			fila++; 

		}
			
	}
			                                           	                                                
}		
	
	

