package algoritmos;

/*
Visualice y registre los múltiplos de 2 o de 3 
que hay entre 1 y 100. 
 */
public class Ejercicio25_AU {

    public static void main(String[] args) {
        int cantMultiplo = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println("\t" + i);
                cantMultiplo +=1;   // cantMultiplo = cantMultiplo + 1
            }
        }
        int multiplos[] = new int[cantMultiplo];
    }
}
