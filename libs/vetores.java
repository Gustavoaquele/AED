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

    public static int BuscaSequencial(int[] v, int x) {
        int i;
        for (i = 0; i < v.length; i++) {
            if (v[i] == x) {
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
            // e salva na posição i do vetor
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }

        return vetor;
    }

    public static int[] gerarValoresAleatoriosOrdenado(int n, int valor_min, int valor_max) {

        // Obtém um vetor de valores aleatórios
        int[] vetor = gerarValoresAleatorios(n, valor_min, valor_max);

        // Ordena o vetor antes de retornar
        Arrays.sort(vetor);

        return vetor;
    }

    public static int BuscaBinaria(int[] vetor, int valor_buscar) {
        int ini, fim, meio;

        ini = 0;
        fim = vetor.length;

        while (ini <= fim) {
            meio = (int) (ini + fim) / 2;
            if (vetor[meio] == valor_buscar) {
                return meio;
            } else {
                if (valor_buscar < vetor[meio]) {
                    fim = meio - 1;
                } else if (valor_buscar > vetor[meio]) {
                    ini = meio + 1;
                }
            }

        }

        return -1;

    }

    public static void trocar(int[] v, int i, int j) {
        int tmp;
        tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;

    }

    public static void bubbleSort(int[] v) {
        int i, j, n;
        n = v.length;
        for (i = 0; i < n; i++) { // percorre de 0 até n-1 (n-1 vezes)
            for (j = 1; j < n - i; j++) { // percorre de 1 até n-i
                if (v[j] < v[j - 1]) { // verifica se o elem. em j é menor que o elem. em j-1
                    trocar(v, j, j - 1); // caso seja menor, troca os elementos
                }
            }
        }
    }

    public static void ordenarInsertionSort(int[] v) {
        int i, j;
        for (i = 1; i < v.length; i++) {
            j = i;
            while (j > 0 && v[j] < v[j - 1]) {
                trocar(v, j, j - 1);
                j--;
            }
        }
    }

    public static void ordenarSelectionSort(int[] v) {
        int i, j, menor_val, menor_pos;
        for (i = 0; i < v.length - 1; i++) {
            menor_val = v[i];
            menor_pos = i;
            for (j = i + 1; j < v.length; j++) {
                if (v[j] < menor_val) {
                    menor_val = v[j];
                    menor_pos = j;
                }
            }
            trocar(v, i, menor_pos);
        }
    }

    public static int[] ordenarMergeSort(int[] va, int[] vb) {
        int i = 0, j = 0, k = 0;
        int vc[] = new int[va.length + vb.length];

        while (i < va.length && j < vb.length) {
            if (va[i] < vb[j]) {
                vc[k] = va[i];
                i++;
            } else {
                vc[k] = vb[j];
                j++;
            }
            k++;
        }
        while (i < va.length) {
            vc[k] = va[i];
            i++;
            k++;
        }
        while (j < vb.length) {
            vc[k] = vb[j];
            j++;
            k++;
        }
        return vc;

    }

    public static int[] subVetor(int[] v, int ini, int fim) {
        int i, k = 0;

        int[] sub_vetor = new int[fim - ini];

        for (i = ini; i < fim; i++) {
            sub_vetor[k] = v[i];
            k++;
        }

        return sub_vetor;
    }

    public static int[] mergeSort(int[] v) {
        int[] ve_ordenado, vd_ordenado, v_ordenado;

        if (v.length <= 1) {
            return v;
        }

        int[] v_esq, v_dir;
        int meio;

        meio = v.length / 2;
        v_esq = subVetor(v, 0, meio);
        v_dir = subVetor(v, meio, v.length);

        ve_ordenado = mergeSort(v_esq);
        vd_ordenado = mergeSort(v_dir);

        v_ordenado = ordenarMergeSort(ve_ordenado, vd_ordenado);

        return v_ordenado;
    }

    public static void mostrarVetor(int[] v) {
        int i;
        System.out.print("[");
        for (i = 0; i < v.length - 1; i++) {
            System.out.print(+v[i] + " ");
        }
        System.out.println("]");

    }

    public static int[] countingSort(int[] v) {
        int[] contadores = new int[10]; // Array de frequências
        int[] contadores_acumulado = new int[10]; // Frequência acumulada
        int[] resultado = new int[v.length]; // Resultado ordenado

        int i;

        // 1. Conta as ocorrências de cada elemento
        for (i = 0; i < v.length; i++) {
            contadores[v[i]]++;
        }

        // 2. Calcula as frequências acumuladas
        contadores_acumulado[0] = contadores[0];
        for (i = 1; i < contadores.length; i++) {
            contadores_acumulado[i] = contadores[i] + contadores_acumulado[i - 1];
        }

        // 3. Ordena o vetor
        for (i = v.length - 1; i >= 0; i--) { // Deve percorrer de trás para frente
            int valor = v[i];
            int posicao = contadores_acumulado[valor] - 1; // Posição correta do elemento
            resultado[posicao] = valor;
            contadores_acumulado[valor]--; // Decrementa a frequência acumulada
        }

        return resultado;
    }

    public static void quickSort(int[] v) {
        quickSort_(v, 0, v.length - 1);
    }
    
    public static void quickSort_(int[] v, int ini, int fim) {
        if (ini < fim) { // Verifica se o intervalo é válido
            int pos_pivot = quickSortPart(v, ini, fim); // Particiona e encontra o pivô
            quickSort_(v, ini, pos_pivot - 1); // Recursão para a parte esquerda
            quickSort_(v, pos_pivot + 1, fim); // Recursão para a parte direita
        }
    }
    
    public static int quickSortPart(int[] v, int ini, int fim) {
        int pivot = v[fim]; // Escolhe o último elemento como pivô
        int i = ini - 1; // Índice do menor elemento
    
        for (int j = ini; j < fim; j++) {
            if (v[j] <= pivot) { // Se o elemento for menor ou igual ao pivô
                i++;
                // Troca os elementos v[i] e v[j]
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
    
        // Coloca o pivô na posição correta
        int temp = v[i + 1];
        v[i + 1] = v[fim];
        v[fim] = temp;
    
        return i + 1; // Retorna a posição do pivô
    }

    public static void radixSort(int[] v) {
        int max = pegarMax(v);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(v, exp);
        }
    }

    private static int pegarMax(int[] v) {
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }

    private static void countSort(int[] v, int exp) {
        int n = v.length;
        int[] saida = new int[n];
        int[] contador = new int[10];

        for (int i = 0; i < n; i++) {
            contador[(v[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            contador[i] += contador[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            saida[contador[(v[i] / exp) % 10] - 1] = v[i];
            contador[(v[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            v[i] = saida[i];
        }
    }
    

}
