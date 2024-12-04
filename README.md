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

![image](https://github.com/user-attachments/assets/3b75f16d-fd5b-46a3-9012-78b1e42f99ab)



SALIDA

El programa imprime por pantalla el sudoku dado como argumento resuelto, al igual que errores que haya encontrado en la ejecución.
* Salida al finalizar el programa:

![image](https://github.com/user-attachments/assets/0f97dd48-6ecd-4c3f-9cef-2bc0849640dd)

