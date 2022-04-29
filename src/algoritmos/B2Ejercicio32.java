package algoritmos;

/**
 Se debe crear la siguiente matriz y asignar en cada posición los valores que 
 *se muestran.
 */
public class B2Ejercicio32 {
    public static void main(String[] args) {
        int matriz[][]= new int[4][4];
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (i==j){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }                
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
