package application;

import domain.Numeros;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        Numeros numeros = new Numeros(numero);
        String resultado = numeros.verificador(numero);

        System.out.println(resultado);

        sc.close();
    }
}
