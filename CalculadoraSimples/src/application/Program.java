package application;

import domain.Calculadora;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //Instancindo scanner
        Scanner sc = new Scanner(System.in);

        //Decidindo a operação a ser usada
        System.out.println("Qual operação você quer realizar? Somar - Subtrair - Dividir - Multiplicar");
        String operacao = sc.nextLine().toLowerCase();

        //Valor 1
        System.out.println("Digite o primeiro valor:");
        double valor1 = sc.nextDouble();

        //Valor 2
        System.out.println("Digite o segundo valor:");
        double valor2 = sc.nextDouble();

        //Instancindo a calculadora 
        Calculadora calculadora = new Calculadora(valor1, valor2);

        if(operacao.equals("somar")) {
            System.out.println(calculadora.Somar());
        }
        if(operacao.equals("subtrair")) {
            System.out.println(calculadora.Subtrair());
        }
        if(operacao.equals("dividir")) {
            System.out.println(calculadora.Dividir());
        }
        if(operacao.equals("multiplicar")) {
            System.out.println(calculadora.Multiplicar());
        }

        //Fechando scanner
        sc.close();
    }
}
