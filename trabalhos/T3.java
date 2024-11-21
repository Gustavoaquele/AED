package trabalhos;

public class T3 {

    public static void mostrarInteiros(int v[], char sep) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf("[%s]\t" + v[i], sep);
        }

    }

    public static int[] filtrarMaiores(int v[], int x) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > x) {
                cont++;
            }
        }
        int[] maior = new int[cont];
        int cont2 = 0;

        for (int j = 0; j < v.length; j++) {
            if (v[j] > x) {
                maior[cont2] = v[j];
                cont2++;
            }
        }
        return maior;
    }

    public static int[] filtrarMenores(int v[], int x) {

        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < x) {
                cont++;
            }
        }
        int[] menor = new int[cont];
        int cont2 = 0;

        for (int j = 0; j < v.length; j++) {
            if (v[j] < x) {
                menor[cont2] = v[j];
                cont2++;
            }
        }
        return menor;
    }

    public static boolean[] aplicarELogico(boolean va[], boolean vb[]) {
        boolean vetor[] = new boolean[va.length];
        for (int i = 0; i < va.length; i++) {
            vetor[i] = va[i] && vb[i];
        }
        return vetor;
    }

    public static boolean[] aplicarOULogico(boolean va[], boolean vb[]) {
        boolean vetor[] = new boolean[va.length];
        for (int i = 0; i < va.length; i++) {
            vetor[i] = va[i] || vb[i];
        }
        return vetor;
    }

    public static int[] aplicarMascara(int v[], boolean mascara[]) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (mascara[i]) {
                cont++;
            }
        }
        int[] vetor = new int[cont];
        int cont2=0;

        for (int j=0;j<v.length;j++){
            if(mascara[j]){
                vetor[cont2]=v[j];
                cont2++;
            }
        }
        return vetor;
    }
}