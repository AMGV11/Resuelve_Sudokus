RESUMEN
El juego del Sudoku consiste en rellenar un cubo de 9 x 9 celdas dispuestas en 9 subgrupos de
3 x 3 celdas, con números del 1 al 9, atendiendo a la restricción de que no se debe repetir el mismo
número en la misma fila, columna o subgrupo de 9. Un Sudoku dispone de varias celdas con un
valor inicial, de modo que debemos empezar a resolver el problema a partir de esta solución parcial
sin modificar ninguna de las celdas iniciales.

Este programa esta hecho para el aprendizaje del algoritmo de Vuelta Atrás (Backtracking) y 
el uso de heurísticas aplicadas a este problema. En este caso, observamos como las heurísticas
de poda y vuelta atras son las mismas que las restricciones de un Sudoku.
Si llegamos a un camino del árbol donde no hay la posibilidad de poner nu número que no respete estas 
restricciones, se para el recorrido, se "poda" el camino y utilizamos el algoritmo de vuelta atrás
para llegar a otro camino posible para llegar a la solución del problema

EJECUCIÓN
El programa se invoca llamando a su ejecutable usando la siguiente sintaxis:
java sudoku [-t][-h] [fichero entrada]
o
java –jar sudoku.jar [-t][-h] [fichero entrada]
donde:
-t                Traza las llamadas recursivas
-h                Muestra esta ayuda
fichero_entrada   Tabla inicial del Sudoku (Necesita la dirección donde se encuentra el archivo)

EJEMPLO DE LLAMADA:
C:\Users\anton> java -jar C:\Users\Antonio\Sudoku.jar -t C:\Users\Antonio\Sudoku_Facil.txt
* Texto de entrada de "Sudoku_Facil.txt":
- 9 6 - 4 - - - 1
1 - - - 6 - - - 4
5 - 4 8 1 - 3 9 -
- - 7 9 5 - - 4 3
- 3 - - 8 - - - -
4 - 5 - 2 3 - 1 8
- 1 - 6 3 - - 5 9
- 5 9 - 7 - 8 3 -
- - 3 5 9 - - - 7

SALIDA
El programa imprime por pantalla el sudoku dado como argumento resuelto, al igual que errores que haya encontrado en la ejecución.
* Salida al finalizar el programa
3 9 6  2 4 5  7 8 1
1 7 8  3 6 9  5 2 4
5 2 4  8 1 7  3 9 6

2 8 7  9 5 1  6 4 3
9 3 1  4 8 6  2 7 5
4 6 5  7 2 3  9 1 8

7 1 2  6 3 8  4 5 9
6 5 9  1 7 4  8 3 2
8 4 3  5 9 2  1 6 7

