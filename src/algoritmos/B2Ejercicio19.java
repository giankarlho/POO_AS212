package algoritmos;
/*
Encontrar el menor y mayor elemento de un arreglo de números de 2 cifras
N términos aleatorios.

*/
public class B2Ejercicio19 {
    public static void main(String[] args) {
        int cantElementos = (int) (Math.random()*(20)) + 10;
        int numeros[] = new int[cantElementos];
        int menor = 999, mayor = 0;
        for (int a=0; a < numeros.length; a++ ){
            numeros[a] = (int) (Math.random()*(89)) + 10;
//            mayor = menor = numeros [0];
            if (numeros[a] < menor) {
                menor = numeros[a];
            }
            if (numeros[a] > mayor){
                mayor = numeros[a];
            }
        }
        System.out.println("El menor nro. del arreglo es: " + menor);
        System.out.println("El mayor nro. del arreglo es: " + mayor);        
        
        for (int j=0 ; j < numeros.length; j++){
            System.out.print("\t" + numeros[j]);
        }
    }
}
