package trabalhos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import libs.entrada;
import libs.caractere;
import libs.vetores;
import libs.tempo;

public class Trab4 {
    public static void ex1() {
        int[] v = vetores.gerarValoresAleatorios(10000000, 0, 10000000);

        System.out.println("## Bubble Sort ##");
        long tempo_inicio = tempo.medirTempoIniciar();
        vetores.bubbleSort(v);
        // vetores.mostrarVetor(v);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        System.out.println("levou " + tempo_segundos + " segundos");
        System.out.println("- - - - -  - - - - - - -");

    }

    public static void ex2() {
        int[] v = vetores.gerarValoresAleatorios(10000000, 0, 1000000);

        System.out.println("## Insertion Sort ##");
        long tempo_inicio = tempo.medirTempoIniciar();
        vetores.ordenarInsertionSort(v);
        // vetores.mostrarVetor(v);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        System.out.println("levou " + tempo_segundos + " segundos");
        System.out.println("- - - - -  - - - - - - -");
    }

    public static void ex3() {
        int[] v = vetores.gerarValoresAleatorios(10000000, 0, 10000000);

        System.out.println("## Selection Sort ##");
        long tempo_inicio = tempo.medirTempoIniciar();
        vetores.ordenarSelectionSort(v);
        // vetores.mostrarVetor(v);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        System.out.println("levou " + tempo_segundos + " segundos");
        System.out.println("- - - - -  - - - - - - -");
    }

    public static void ex4() {
        int[] v = vetores.gerarValoresAleatorios(10000000, 0, 10000000);

        System.out.println("## Merge Sort ##");
        long tempo_inicio = tempo.medirTempoIniciar();
        vetores.mergeSort(v);
        // vetores.mostrarVetor(v);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        System.out.println("levou " + tempo_segundos + " segundos");
        System.out.println("- - - - -  - - - - - - -");
    }

    public static void ex5() {
        int[] v = vetores.gerarValoresAleatorios(10000000, 0, 10000000);

        System.out.println("## Quick Sort ##");
        long tempo_inicio = tempo.medirTempoIniciar();
        vetores.quickSort(v);
        // vetores.mostrarVetor(v);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        System.out.println("levou " + tempo_segundos + " segundos");
        System.out.println("- - - - - - - - - - - -");
    }

    public static void ex6() {
        int[] v = vetores.gerarValoresAleatorios(10000000, 0, 9);

        System.out.println("## Counting Sort ##");
        long tempo_inicio = tempo.medirTempoIniciar();
        vetores.countingSort(v);
        // vetores.mostrarVetor(v);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        System.out.println("levou " + tempo_segundos + " segundos");
        System.out.println("- - - - -  - - - - - - -");
    }

    public static void ex7() {
        int[] v = vetores.gerarValoresAleatorios(10000000, 0, 10000000);

        System.out.println("## Radix Sort ##");
        long tempo_inicio = tempo.medirTempoIniciar();
        vetores.radixSort(v);
        // vetores.mostrarVetor(v);
        double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);
        System.out.println("levou " + tempo_segundos + " segundos");
        System.out.println("- - - - -  - - - - - - -");
    }

}
