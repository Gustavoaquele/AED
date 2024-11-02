
package aulas;

import libs.vetores;

public class aula34 {
        public static void aula() {
            System.out.println("Aula do dia 29/10 - Registros");
    
            ex01();
        }  


        public static void ex01(){
            int[] v = vetores.gerarValoresAleatorios(1000, 0, 100000);
            int x = 5000;


           int pos = libs.vetores.BuscaSequencial(v,x);

           if (pos != -1){
            System.out.println("Valor "+x+ " encontrado na posição "+pos);
           }else{
            System.out.println("Valor "+x+" não encontrado");
           }

        }
}
