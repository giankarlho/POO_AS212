package algoritmos;

import java.util.Scanner;

public class Calculadora1 {
    
    public static void main(String[] args) {
        double nro1 = 0.0, nro2=0.0, resultado=0.0;
        nro1 = (int)(Math.random()*100) + 1;
        System.out.println("Nro1 : " + nro1);
        nro2 = (int)(Math.random()*100) + 1;        
        System.out.println("Nro2 : " + nro2);
        System.out.println("Ing. el operador '+'  '-' '*' '/' :");
        Scanner ingreso = new Scanner(System.in);
        char operador = ingreso.next().charAt(0);
        switch(operador){
            case '+': resultado = nro1 + nro2; break;
            case '-': resultado = nro1 - nro2; break;
            case '*': resultado = nro1 * nro2; break;
            case '/': resultado = nro1 / nro2; break;
        }
        System.out.println("El resultado es: " + resultado);
    }    
}



//        if (operador =='+'){
//            resultado = nro1 + nro2;
//        } else if (operador =='-'){
//            resultado = nro1 + nro2;
//        } else if (operador =='*'){
//            resultado = nro1 * nro2;
//        } else if (operador =='/'){
//            resultado = nro1 / nro2;
//        }
