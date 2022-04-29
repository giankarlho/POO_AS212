package algoritmos;
/*
Leer 15 números enteros aleatorios de tres cifras, almacenarlos en un arreglo
y determinar si existe al menos un número repetido.

*/
public class B2Ejercicio30 {
    public static void main(String[] args) {
        int nros[] = new int[15];
        for (int j=0 ; j < 15; j++){
            nros[j]= (int) (Math.random()*(899)) + 100;
//            nros[j]= (int) (Math.random()*(989)) + 10;
        }
        int cantValor = 0, cantNros=0;        
        for (int i=0 ; i<15; i++){
            for (int k=0; k<15; k++){
                if (nros[i]== nros[k]){
                    cantValor +=1;
                }                
            }            
            if (cantValor > 1){
                cantNros +=1;
            }
            cantValor = 0;            
        }
        if (cantNros > 0){
            System.out.println("Existe " + cantNros + " repetidos");
        } else{
            System.out.println("No existen nros. repetidos");
        }          
        for (int m=0; m<15; m++){
            System.out.print("\t" + nros[m]);
        }
    }
}
