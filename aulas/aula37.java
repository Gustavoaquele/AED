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
        String msg = "hoje e um dia apos ontem hoje tambem e um dia antes de amanha hoje nao e ontem nem amanha";
        String[] palavras = msg.split(" ");
        String palavra;
        int i,n;

        // for(i=0;i<palavras.length;i++){
        //     System.out.println(palavras[i]);
        // }
    

    Hashtable<String, Integer> contador = new Hashtable<>();

    for(i=0;i<palavras.length;i++){
        palavra = palavras[i];

        if (contador.containsKey(palavra)){
            n = contador.get(palavra);
            System.out.println(n);
            contador.put(palavra, contador.get(palavra)+1);
        }else{
            contador.put(palavra, 1);
        }
    }
    for (String posicao : contador.keySet()) {
        System.out.printf("[%s]\t%d\n", posicao, contador.get(posicao));
    }

    }

    public static void ex03(){
        System.out.println("Vetor esparso");

        int[] vetor = {0,0,0,0,0,0,0,0,0,50,60,0,0,0,0,0,0,0,0,0,0,0,0,20};
        int i;

        Hashtable<String, Integer> vetor_esparso = new Hashtable<>();

        for(i=0;i<vetor.length;i++){
            if(vetor[i]!=0){
                vetor_esparso.put(i, vetor[i]);
            }
        }
    }

    }

   
