package pruebas;

public class Pruebas {
    public static void main(String[] args) {
        int min=1,max=6;
        
        int value2 = (int) (Math.random()*max) + min;
	System.out.println("Usando Math.random: " + value2);
        System.out.println("Math.random(): " + Math.random()*10);
    }
}
