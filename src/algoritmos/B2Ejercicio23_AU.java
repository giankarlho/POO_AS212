package algoritmos;

/*
 Calcule la suma de los elementos del siguiente arreglo:
A[6] = {5 , 9 , 4 , 8 , 12 , 9}

 */
public class B2Ejercicio23_AU {

    public static void main(String[] args) {
        int A[] = new int[6];
        // A[6] = {5 , 9 , 4 , 8 , 12 , 9};
        int[] B = {5, 9, 4, 8, 12, 9};
        int[] C = new int[]{5, 9, 4, 8, 12, 9};
        A[0] = 5;
        A[1] = 9;
        A[2] = 4;
        A[3] = 8;
        A[4] = 12;
        A[5] = 9;
        int suma = 0;
        for (int m=0; m < A.length ; m++){
            suma +=A[m];    // suma = suma + A[m]
        }
        System.out.println("La suma es: " + suma);
    }
}
