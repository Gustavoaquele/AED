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

public class aula37 {
    public static void aula() {
        System.out.println("Aula do dia 12/11 - Tabelas Hash");
       // ex01();
         ex02();
        // ex03();
        // ex04();
    }

    public static void ex01() {
        Hashtable<String, Integer> tabela = new Hashtable<>();

        tabela.put("Batata", 10);
        tabela.put("Carne", 15);
        tabela.put("Abacate", 3);

        for (String posicao : tabela.keySet()) {
            System.out.printf("[%s]\t%d\n", posicao, tabela.get(posicao));
        }
        int qtde_carne = tabela.get("Carne");
        System.out.println("Carne " + qtde_carne);
    }

    public static void ex02(){
        String msg = "hoje e um dia apos ontem hoje tambem e um dia antes de amanhã";
        String[] palavras = msg.split(" ");
        int i;

        for(i=0;i<palavras.length;i++){
            System.out.println(palavras[i]);
        }
    }

}
   
