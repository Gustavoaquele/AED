package aulas;

import libs.entrada;
import libs.caractere;


class Pessoa{
    int idade;
    String nome;
    int altura;

    public void mostrar(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
    }
}

class Dados{
    String email,nome,datanasc;
    Endereco endereco;
    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("Data de nascimento: "+datanasc);
           System.out.println("Email: "+email);
  
    }
}

class Endereco{
    String rua,numero,cep,cidade,estado,pais;

    public void mostrar(){
        System.out.println("Rua: "+rua);
        System.out.println("Numero: "+numero);
        System.out.println("CEP: "+cep);
        System.out.println("Cidade: "+cidade);
        System.out.println("Estado: "+estado);
        System.out.println("País: "+pais);
    }
}
public class aula33 {
    public static void aula() {
        System.out.println("Aula do dia 29/10 - Registros");

        ex01();
    }
    public static void ex01(){
        Pessoa gustavo = new Pessoa();
        Pessoa Joao = new Pessoa();

        gustavo.idade = 23;
        gustavo.nome = "Gustavo";
        gustavo.altura = 185;
        gustavo.mostrar();

        Joao.nome = "Joao";
        Joao.idade = 22;
        Joao.altura = 176;
        Joao.mostrar();
    }
    public static void ex02(){
        entrada.abrir();
        Dados pessoas = new Dados();
        pessoas.endereco = new Endereco();
        
        
        pessoas.nome = entrada.lerFrase("Digite seu nome: ");
        pessoas.datanasc = entrada.lerFrase("Digite sua data de Nascimento: ");
        pessoas.email = entrada.lerFrase("Digite seu Email: ");

        pessoas.endereco.rua = entrada.lerFrase("Digite sua Rua: ");
        pessoas.endereco.numero = entrada.lerFrase("Digite seu Numero: ");
        pessoas.endereco.cep = entrada.lerFrase("Digite seu CEP: ");
        pessoas.endereco.cidade = entrada.lerFrase("Digite seu Cidade: ");
        pessoas.endereco.estado = entrada.lerFrase("Digite seu Estado: ");
        pessoas.endereco.pais = entrada.lerFrase("Digite seu País: ");

        pessoas.mostrar();
        pessoas.endereco.mostrar();
        

    }

    public static void ex03(){
        entrada.abrir();
        Dados[] pessoas = new Dados[10];
        
        int i;

        for(i=0;i<pessoas.length;i++){
            pessoas[i] = new Dados();
            pessoas[i].endereco = new Endereco();
            pessoas[i].nome = entrada.lerFrase("Digite seu nome: ");
            pessoas[i].datanasc = entrada.lerFrase("Digite sua data de Nascimento: ");
            pessoas[i].email = entrada.lerFrase("Digite seu Email: ");
            
            pessoas[i].endereco.rua = entrada.lerFrase("Digite sua Rua: ");
            pessoas[i].endereco.numero = entrada.lerFrase("Digite seu Numero: ");
            pessoas[i].endereco.cep = entrada.lerFrase("Digite seu CEP: ");
            pessoas[i].endereco.cidade = entrada.lerFrase("Digite seu Cidade: ");
            pessoas[i].endereco.estado = entrada.lerFrase("Digite seu Estado: ");
            pessoas[i].endereco.pais = entrada.lerFrase("Digite seu País: ");
    
        }

        for(i=0;i<pessoas.length;i++){
            pessoas[i].mostrar();
            pessoas[i].endereco.mostrar();
    }

    }
}