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

public class aula38 {
    public static void aula() {
        System.out.println("Aula do dia 19/11 - Ordenação InsertionSort e SelectionSort");
        // ex01();
        //ex02();
         ex03();
        // ex04();
    }

    public static void ex01() {
        System.out.println("## Insertion Sort ##");
        int[] v_0 = { 17, 5, 0, 18, 2, 9 };
        int i, j;
        vetores.ordenarInsertionSort(v_0);
        System.out.print("[");
        for (i = 0; i < v_0.length; i++) {
            System.out.print(+v_0[i] + " ");
        }
        System.out.print("]");

    }

    public static void ex02() {
        System.out.println("## Selection Sort ##");
        int[] v_0 = { 17, 5, 0, 18, 2, 9 };
        vetores.ordenarSelectionSort(v_0);
        vetores.mostrarVetor(v_0);

    }
    public static void ex03(){
        int[] va={0,2,4,7,8,15};
        int[] vb={1,3,5,10};

        vetores.ordenarMergeSort(va, vb);
        }
    }
