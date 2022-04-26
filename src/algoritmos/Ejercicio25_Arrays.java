package algoritmos;

import java.util.ArrayList;
import java.util.List;

/*
Visualice y registre los múltiplos de 2 o de 3 
que hay entre 1 y 100. 
 */
public class Ejercicio25_Arrays {

    public static void main(String[] args) {
//        int cantMultiplo = 0;
        List<Integer> multiplos = new ArrayList<>(); 
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print("\t" + i);
//                cantMultiplo += 1;   // cantMultiplo = cantMultiplo + 1
                multiplos.add(i);
            }
        }
        System.out.println("\nLa cant. de múltiplos: " + multiplos.size());
//        int multiplos[] = new int[cantMultiplo];        
        
    }
}
