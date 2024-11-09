package aulas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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

public class aula36 {
    public static void aula() {
        System.out.println("Aula do dia 8/11 - Lista");
        // ex01();
        // e x02();
         ex03();
        // ex04();
    }

    public static void ex01() {
        LinkedList<Integer> lista = new LinkedList<>();
        int x, i;

        lista.add(1);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(10);
        lista.add(20);
        lista.add(30);

        for (i = 0; i < lista.size(); i++) {
            x = lista.get(i);
            System.out.printf("[%d] %d\n", i, x);
        }
        System.out.println("----");

        lista.add(3, 500);// adiciona 500 no lugar 3 da lista
        lista.set(5, 400);// substitui a posição 4 por 400

        for (i = 0; i < lista.size(); i++) {
            x = lista.get(i);
            System.out.printf("[%d] %d\n", i, x);

        }
        System.out.println("----");

        for (int y : lista) {
            System.out.printf("[%d] %d\n", lista.indexOf(y), y);
        }

        System.out.println("----");

        ListIterator<Integer> l = lista.listIterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }
    }

    public static void ex02() {
        ArrayList<Integer> lista = new ArrayList<>();
        int x, i;

        lista.add(1);
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
        lista.add(60);
        lista.add(10);
        lista.add(20);
        lista.add(30);

        for (i = 0; i < lista.size(); i++) {
            x = lista.get(i);
            System.out.printf("[%d] %d\n", i, x);
        }
        System.out.println("----");

        lista.add(3, 500);// adiciona 500 no lugar 3 da lista
        lista.set(5, 400);// substitui a posição 4 por 400

        for (i = 0; i < lista.size(); i++) {
            x = lista.get(i);
            System.out.printf("[%d] %d\n", i, x);

        }
        System.out.println("----");

        for (int y : lista) {
            System.out.printf("[%d] %d\n", lista.indexOf(y), y);
        }

        System.out.println("----");

        ListIterator<Integer> l = lista.listIterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }
    }
    public static void ex03(){
        Set<Integer> conjunto = new HashSet<>();
        
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(40);
        
        for(int y : conjunto){
            System.out.println(y);
        }
        
        System.out.printf("Elemento 30 está no conjunto? %b\n", conjunto.contains(30));
        System.out.printf("Elemento 30 está no conjunto? %b\n", conjunto.contains(70));
    }
}
