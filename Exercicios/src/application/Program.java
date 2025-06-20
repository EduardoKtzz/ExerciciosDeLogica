package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Criando lista
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 3 números:");


        for (int i = 0; i<3; i++) {
            System.out.println("Número " + (i+1) + ":");
            int numerosDigitados = sc.nextInt();

            numeros.add(numerosDigitados);
        }

        int maior = numeros.get(0);
        for (Integer numero : numeros) {

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Esse é o maior: " + maior);

        sc.close();
    }
}
