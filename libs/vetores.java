package libs;

import java.util.Random;

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

}
