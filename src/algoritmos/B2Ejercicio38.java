package algoritmos;

public class B2Ejercicio38 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int contador=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                contador +=2;
                matriz[i][j] = contador;
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
        }
    }

}
