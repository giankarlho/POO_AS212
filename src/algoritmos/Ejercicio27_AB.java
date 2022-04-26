package algoritmos;

import java.util.Scanner;

/*
Calcular las calificaciones de un grupo de alumnos aleatorio de 5 a 20. 
La nota vigesimal final de cada alumno se calcula según el siguiente criterio: 
Práctica vale el 10%;
Problemas vale el 50% 
Teórica el 40%. 
El algoritmo leerá el nombre del alumno, las tres notas, 
escribirá el resultado y volverá a pedir los datos del siguiente 
alumno hasta que el nombre sea una cadena vacía. 
Las notas deben estar entre 0 y 20, si no lo están,
no imprimirá las notas, mostrará un mensaje de error y 
volverá a pedir otro alumno.
*/

public class Ejercicio27_AB {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int min=5,max=20;
        int cantAlumnos = (int) (Math.random()*max) + min;
	System.out.println("Cantidad de Alumnos: " + cantAlumnos);
        double notas[][] = new double[cantAlumnos][4];
        String alumno[] = new String[cantAlumnos];
        for (int i=0; i<cantAlumnos; i++){
            System.out.print("Ing. el nombre del alumno: ");
            alumno[i] = ingreso.next();
            for (int j=0; j<3; j++){
                System.out.print("Ing. la nota " + (j+1) + ": ");
                notas[i][j] = ingreso.nextInt();
            }
            notas[i][3] = notas[i][0]*0.1 + notas[i][1]*0.5 + notas[i][2]*0.4;
        }       
    }
}
