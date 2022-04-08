package services;

public class CalculadoraS {

    public Double dobResultado = 0.0;
    public String strResultado = "";

    public void calcular(Double nro1, char operador, Double nro2) {

        switch (operador) {
            case '+':
                dobResultado = nro1 + nro2;
                break;
            case '-':
                dobResultado = nro1 - nro2;
                break;
            case '*':
                dobResultado = nro1 * nro2;
                break;
            case '/':
                dobResultado = nro1 / nro2;
                break;
        }
    }
    
    public String validarPrimo (int numero){
        int cantDiv = 0;
        for (int i=1; i<=numero ; i++){
            if (numero %i == 0){
                cantDiv++;  // cantDiv = cantDiv + 1
            }
        }
        if (cantDiv == 2){
            strResultado ="Es primo";
        } else{
            strResultado= "No es primo";
        }
        return strResultado;
    }
    
//    public static void main(String[] args) {
//        CalculadoraS calculadora = new CalculadoraS();
//        System.out.println("Resultado: " + calculadora.validarPrimo(17));
//    }
}
