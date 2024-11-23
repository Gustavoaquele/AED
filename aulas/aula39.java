package aulas;

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

public class aula39 {
    public static void aula() {
        System.out.println("Aula do dia 19/11 - Ordenação MergeSort");
       // ex01();
         ex02();
        // ex03();
        // ex04();
    }

    public static void ex01() {
        System.out.println("## Sub vetor teste ##");
        int meio;

        int[] v_0 = { 4, 1, 7, 0, 8, 5, 2, 9, 6, 3 };
        System.out.println("Entrada: ");
        vetores.mostrarVetor(v_0);

        meio = v_0.length / 2;
        System.err.println(meio);

        int[] v_0_sub_vetor_esq = vetores.subVetor(v_0, 0, meio);
        vetores.mostrarVetor(v_0_sub_vetor_esq);
        int[] v_0_sub_vetor_dir = vetores.subVetor(v_0, meio, v_0.length);
        vetores.mostrarVetor(v_0_sub_vetor_dir);



        System.out.println("------");

    }

    public static void ex02(){

        int[] v_0 = { 4, 1, 7, 0, 8, 5, 2, 9, 6, 3 };
        System.out.println("Entrada: ");
        vetores.mostrarVetor(v_0);

        System.out.println("-------");

        int[] v_0_ordenado = vetores.mergeSort(v_0);
        System.out.println("Saída: ");
        vetores.mostrarVetor(v_0_ordenado);

        System.out.println("-------");
        
    }
}