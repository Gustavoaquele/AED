package trabalhos;
import libs.vetores;
import java.util.Scanner;
import libs.entrada;


public class Bim3T1 {
    public static void Ex3() {
        
        filtrarMenores(1, 4);
    }
    public static void MostrarInteiros(int b, char separador){
        int[]a=vetores.alocarInteiros(10);
        separador = entrada.lerCaractere();

        
    }

    public static void filtrarMenores(int x, int y){

        y=entrada.lerInt();
        int[]a=vetores.alocarInteiros(10);
        int[]b=new int[a.length];
        for(int i=0;i<y;i++){
            System.out.println();
        }
        
    }
    public static void filtrarMaiores(int x, int y){

        y=entrada.lerInt();
        int[]a=vetores.alocarInteiros(10);
        int[]b=new int[a.length];
        for(int i=y;i<y;i++){
            System.out.println();
        }
        
    }

    public static void aplicarELogico(){
        boolean[]a=vetores.alocarLogicos(5);
        boolean[]b=vetores.alocarLogicos(5);

        for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < a.length; j++) {
				
				if(a[j] && b[i]) {
			    ;
				
				}
			}
    }


    
}
