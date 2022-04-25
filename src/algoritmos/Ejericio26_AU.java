package algoritmos;

public class Ejericio26_AU {

    public static void main(String[] args) {
        // Determinar si un alumno aprueba o desaprueba una materia,
        // basado en promedio de N calificaciones.
        Double notas[] = new Double[5];
        Double sumaNotas = 0.0, promedio = 0.0;
        for (int j = 0; j < notas.length; j++) {
            notas[j] = (Double) (Math.random() * (20)); // notas aleatorias del 1 - 20
            sumaNotas += notas[j];   // sumaNotas = sumaNotas + notas[j]
            System.out.print(notas[j] + "\t");
        }
        promedio = sumaNotas / notas.length;
        if (promedio >= 13) {
            System.out.println("Aprobó");
        } else {
            System.out.println("Desaprobó");
        }   
        // Redondeando
        System.out.println(Math.round(promedio*100.0)/100.0);
        System.out.println(String.format("%.2f",promedio));
    }
}
