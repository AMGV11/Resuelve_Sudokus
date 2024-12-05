
# Resuelve_Sudokus

Este programa esta hecho para el aprendizaje del algoritmo de Vuelta Atrás (Backtracking) y el uso de heurísticas aplicadas a este problema. En este caso, observamos como las heurísticas de poda y vuelta atras son las mismas que las restricciones de un Sudoku. Si llegamos a un camino del árbol donde no hay la posibilidad de poner nu número que no respete estas restricciones, se para el recorrido, se "poda" el camino y utilizamos el algoritmo de vuelta atrás para llegar a otro camino posible para llegar a la solución del problema.


## Autor

- [@AMGV11](https://www.github.com/octokatherine)


## Ejecución

El programa se invoca llamando a su ejecutable usando la siguiente sintaxis desde la consola:



```cmd
 java sudoku [-t][-h] [fichero entrada]
```
o
```cmd
java –jar sudoku.jar [-t][-h] [fichero entrada]
```
donde:

- **[-t]** Traza las llamadas recursivas
- **[-h]** Muestra la ayuda para la sintaxis
- **[fichero_entrada]** Tabla inicial del Sudoku (Necesita la dirección donde se encuentra el archivo)
## Ejemplo

Usamos tests de la carpeta Ejemplos del repositorio:

```cmd
  C:\Users\anton> java -jar C:\Users\Antonio\Sudoku.jar -t C:\Users\Antonio\Sudoku_Facil.txt
```
* Texto de entrada de "Sudoku_Facil.txt":
![Sudoku_Normal](https://github.com/user-attachments/assets/cc83fc53-b36b-4196-859c-bbe441fb4b0e)


El programa imprime por pantalla el sudoku dado como argumento resuelto, al igual que errores que haya encontrado en la ejecución.

* Salida al finalizar el programa:

![Resolución_Sudoku_Normal](https://github.com/user-attachments/assets/8d1409af-82d4-4399-9cbf-f4ab75a66787)

