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

public class aula40 {
    public static void aula() {
        System.out.println("Aula do dia 29/11 - Ordenação Counting Sort");
       ex01();
         //ex02();
        // ex03();
        // ex04();
    }

    public static void ex01() {
        System.out.println("Counting Sort");
        int meio;

        int[] v_0 = { 7, 2, 9, 2, 7, 1, 9, 2, 0 };
        System.out.println("Entrada: ");
        vetores.mostrarVetor(v_0);

        System.out.println("-------");

        int[] v_0_ordenado = vetores.countingSort(v_0);
        System.out.println("Saída: ");
        vetores.mostrarVetor(v_0_ordenado);

        System.out.println("-------");
        
    }
}