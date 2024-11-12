package aulas;

import libs.matrizes;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import libs.vetores;

public class aula31 {
    public static void aula() {
        System.out.println("Aula do dia 30/09: Arquivos");
        System.out.println("============================");
        // ex01();//ler e calcular media
        ex02();// Lendo numeros dentro do arquivo

    }

    // public static void ex01(){

    // String nome_arquivo = "./arquivos/valores.txt";
    // int i,soma=0,valor_lido;
    // double media;

    // try{

    // File arquivo = new File(nome_arquivo);
    // Scanner entrada = new Scanner(arquivo);

    // for (i = 0; i <10;i++){
    // valor_lido = entrada.nextInt();
    // soma = soma+valor_lido;
    // }
    // media = soma/10;
    // System.out.println("Média: "+media);

    // }catch(Exception e){
    // System.err.println("Erro. " );
    // System.err.println(e);
    // }
    // }

    public static void ex02() {

        String nome_arquivo = "./arquivos/valores_n.txt";
        int valor, v;

        try {

            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);
            v = entrada.nextInt();

            for (int i = 1; i <= v; i++) {
                valor = entrada.nextInt();
                System.out.println(valor);
            }

        } catch (Exception e) {
            System.err.println("Erro. ");
            System.err.println(e);

        }
    }
}