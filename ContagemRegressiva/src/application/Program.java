package application;

import domain.ContagemRegressiva;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Instancindo o scanner
        Scanner sc = new Scanner(System.in);

        //Definindo um número para começar um cadastro na contagem regressiva
        System.out.println("Digite um número para começar a contagem regressiva:");
        int numero = sc.nextInt();

        //Instancindo a classe e chamando a função
        ContagemRegressiva contagemRegressiva = new ContagemRegressiva(numero);
        contagemRegressiva.contagemRegressiva(numero);

        //Fechando scanner
        sc.close();
    }
}
