package application;

import domain.Tabuada;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber a tabuada:");
        Integer numero = sc.nextInt();

        System.out.println("Digite até qual número você quer ver a tabuada:");
        Integer limite = sc.nextInt();

        if (limite < 0) {
            System.out.println("O limite precisa ser um número positivo");
        }

        Tabuada tabuada = new Tabuada(numero, limite);
        tabuada.TabuadaCompleta();

        sc.close();
    }
}
