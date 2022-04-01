package algoritmos;

public class Calculadora1 {
    
    public static void main(String[] args) {
        double nro1 = 0.0, nro2=0.0, resultado;
        nro1 = (int) (Math.random()*(100-1)) + 1;
        nro2 = (int) (Math.random()*(100-1)) + 1;
        char operador = 0;
        System.out.println("Ing. el operador: '+'  '-' '*' '/' ");
        switch(operador){
            case '+': resultado = nro1 + nro2; break;
            case '-': resultado = nro1 - nro2; break;
            case '*': resultado = nro1 * nro2; break;
            case '/': resultado = nro1 / nro2; break;
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

    }
    
}
