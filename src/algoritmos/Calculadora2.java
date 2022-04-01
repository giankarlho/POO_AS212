package algoritmos;

import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args) {
        double nro1 = 0.0, nro2 = 0.0, resultado = 0.0;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ing. el 1er. nro. : ");
        nro1 = ingreso.nextDouble();        
        int estado = 1;     // acepto
        while (estado == 1) {
            System.out.println("Ing. el operador '+'  '-' '*' '/' :");
            char operador = ingreso.next().charAt(0);
            System.out.println("Ing. el sgte. nro. : ");
            nro2 = ingreso.nextDouble();
            switch (operador) {
                case '+':
                    resultado = nro1 + nro2;
                    break;
                case '-':
                    resultado = nro1 - nro2;
                    break;
                case '*':
                    resultado = nro1 * nro2;
                    break;
                case '/':
                    resultado = nro1 / nro2;
                    break;
            }
            nro1 = resultado;
            System.out.println("El resultado es: " + resultado);
            System.out.println("Deseas continuar, escribe 1->SI o 2->NO : ");
            estado = ingreso.nextInt();            
            if (estado != 1 & estado != 2) {
                estado = 1;
            }             
        }
    }
}
