
package aulas;

import libs.tempo;
import libs.vetores;

public class aula34 {
        public static void aula() {
            System.out.println("Aula do dia 29/10 - Registros");
    
            //ex01(); gera valores aleatorios e busca a posição 
            //ex02(); mesma coisa mas mede o tempo em seg
            //ex03(); mesma coisa com um for
            ex04();
        }  


        public static void ex01(){
            int[] v = vetores.gerarValoresAleatorios(100000, 0, 100000);
            int x = 5000;


           int pos = libs.vetores.BuscaSequencial(v,x);

           if (pos != -1){
            System.out.println("Valor "+x+ " encontrado na posição "+pos);
           }else{
            System.out.println("Valor "+x+" não encontrado");
           }

        }

        public static void ex02(){
            int[] v = vetores.gerarValoresAleatorios(100000, 0, 100000);
            int x = 5000;

    
            long tempo_inicio = tempo.medirTempoIniciar();
           int pos = libs.vetores.BuscaSequencial(v,x);
           double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);

           if (pos != -1){
            System.out.println("Valor "+x+ " encontrado na posição "+pos);
           }else{
            System.out.println("Valor "+x+" não encontrado");
           }
           System.out.println("Encontrado em "+tempo_segundos+" segundos");

        }

        public static void ex03(){
            int[] v = vetores.gerarValoresAleatorios(10000000, 0, 10000000);
            int x = 5000;

            for (int i =0;i<=10;i++){
            long tempo_inicio = tempo.medirTempoIniciar();
           int pos = libs.vetores.BuscaSequencial(v,x);
           double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);

           if (pos != -1){
            System.out.println("Valor "+x+ " encontrado na posição "+pos);
           }else{
            System.out.println("Valor "+x+" não encontrado");
           }
           System.out.println("Encontrado em "+tempo_segundos+" segundos");
           System.out.println(" ");
        }
        }

        public static void ex04(){
            int[] v = vetores.gerarValoresAleatoriosOrdenado(100000, 0, 100000);
            int x = 5000;

            for (int i =0;i<=10;i++){
            long tempo_inicio = tempo.medirTempoIniciar();
           int pos = libs.vetores.BuscaSequencial(v,x);
           double tempo_segundos = tempo.medirTempoFinalizarSegundos(tempo_inicio);

           if (pos != -1){
            System.out.println("Valor "+x+ " encontrado na posição "+pos);
           }else{
            System.out.println("Valor "+x+" não encontrado");
           }
           System.out.println("Encontrado em "+tempo_segundos+" segundos");
           System.out.println(" ");
        }
        }



        }

