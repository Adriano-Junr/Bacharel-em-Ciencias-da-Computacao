package com.company;

import java.util.Scanner;

//Construa um algoritmo em Java que receba dois valores ponto flutuantes e inverta as posicões
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a, b;
        System.out.print("Digite o primeiro valor: ");
        a = Double.parseDouble(ler.nextLine());
        System.out.print("Digite o segundo valor: ");
        b = Double.parseDouble(ler.nextLine());
        System.out.println(" ");
        System.out.println("Entrada: "+a+"   "+b);
        System.out.println("Saída: "+b+"   "+a);


    }
}
