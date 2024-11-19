package libs;

import java.util.Random;
import java.util.Arrays;

public class vetores {
    public static int[] alocarInteiros(int n) {
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        return vetor;
    }

    public static float[] alocarReais(int n) {
        float[] vetor = new float[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        return vetor;
    }

    public static boolean[] alocarLogicos(int n) {
        boolean[] vetor = new boolean[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = false;
        }
        return vetor;
    }

    public static char[] alocarCaracteres(int n) {
        char[] vetor = new char[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = '\0';
        }
        return vetor;
    }


    public static int BuscaSequencial(int[]v, int x){
        int i;
        for (i=0;i<v.length;i++){
            if(v[i]==x){
                return i;
            }
        }
        return -1;
    }

   


public static int[] gerarValoresAleatorios(int n, int valor_min, int valor_max) {
        Random random = new Random();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            // Gera um número aleatório entre min (inclusivo) e max (inclusivo),
            //   e salva na posição i do vetor
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }
        
        return vetor;
    }
  


public static int[] gerarValoresAleatoriosOrdenado(int n, int valor_min, int valor_max) {

        //Obtém um vetor de valores aleatórios
        int[] vetor = gerarValoresAleatorios(n, valor_min, valor_max);

        // Ordena o vetor antes de retornar
        Arrays.sort(vetor);

        return vetor;
    }

    public static int BuscaBinaria(int[]vetor, int valor_buscar){
        int ini,fim,meio;

        ini = 0;
        fim = vetor.length;

        while (ini <= fim){
            meio =(int)(ini+fim)/2;
            if(vetor[meio]== valor_buscar){
                return meio;
            }else{
                if (valor_buscar<vetor[meio]){
                    fim = meio-1;
                }else if(valor_buscar>vetor[meio]){
                    ini = meio+1;
                }
            }

        }



        return -1;

}

public static void trocar(int[]v,int i, int j){
int tmp;
tmp= v[i];
v[i]=v[j];
v[j]=tmp;

}

public static void ordenarInsertionSort(int[] v){
    int i,j;
    for(i=1;i<v.length;i++){
        j=i;
        while(j>0 && v[j]<v[j-1]){
            trocar(v,j,j-1);
            j--;
        }
    }
}
}
