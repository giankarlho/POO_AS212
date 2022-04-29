package algoritmos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Aleatorio {
    public static void main(String[] args) {
//        // Opciòn 1 
//        Random random = new Random();
//        int value1 = random.nextInt(10)+11;  //0-9  -> 11-20
//        System.out.println("Usando Random: " + value1);
//        
//        // Opciòn 2
//        int min=11,max=20;
//        int value2 = (int) (Math.random()*(max)) + min;
//	System.out.println("Usando Math.random: " + value2);
//        
//        // Opciòn 3
//        int value3 = ThreadLocalRandom.current().nextInt(min, max) + min;
//        System.out.println("Usando ThreadLocalRandom: " + value3);
        
        
        int valor = (int)(Math.random()*89) + 10 ;
        System.out.println("Valor 1: " + valor);
        
        Random random = new Random();
        int value1 = random.nextInt(90)+10;  //  -> 10-99
        System.out.println("Valor 2: " + value1);
    }
}
