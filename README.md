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

[-t]                Traza las llamadas recursivas

[-h]                Muestra esta ayuda

[fichero_entrada]   Tabla inicial del Sudoku (Necesita la dirección donde se encuentra el archivo)


EJEMPLO DE LLAMADA

C:\Users\anton> java -jar C:\Users\Antonio\Sudoku.jar -t C:\Users\Antonio\Sudoku_Facil.txt
* Texto de entrada de "Sudoku_Facil.txt":

![Sudoku_Normal](https://github.com/user-attachments/assets/cc83fc53-b36b-4196-859c-bbe441fb4b0e)


SALIDA

El programa imprime por pantalla el sudoku dado como argumento resuelto, al igual que errores que haya encontrado en la ejecución.
* Salida al finalizar el programa:


![Resolución_Sudoku_Normal](https://github.com/user-attachments/assets/8d1409af-82d4-4399-9cbf-f4ab75a66787)

