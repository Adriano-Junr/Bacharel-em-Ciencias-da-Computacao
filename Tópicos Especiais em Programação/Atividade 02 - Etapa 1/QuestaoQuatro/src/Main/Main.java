package Main;

import java.util.Scanner;

public class Main {
//4. Construa um algoritmo que receba 3 valores inteiros e ordene-os
// em ordem crescente e em ordem descrecente.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        do{
            System.out.print("Digite o valor 1: ");
            a = Integer.parseInt(ler.nextLine());
            System.out.print("Digite o valor 2: ");
            b = Integer.parseInt(ler.nextLine());
            System.out.print("Digite o valor 3: ");
            c = Integer.parseInt(ler.nextLine());
            if(a==b || b==c || a==c)
                System.out.println("Valores digitados iguais! Tente novamente.");
        }while(a==b || b==c || a==c);

        if (a > b && b > c) {//a>b>c
            System.out.println("Ordem crescente: "+c+" "+b+" "+a);
            System.out.println("Ordem decrescente: "+a+" "+b+" "+c);
        } else if(a>c && c>b){//a>c>b
            System.out.println("Ordem crescente: "+b+" "+c+" "+a);
            System.out.println("Ordem decrescente: "+a+" "+c+" "+b);
        }else if(b>a && a>c){//b>a>c
            System.out.println("Ordem crescente: "+c+" "+a+" "+b);
            System.out.println("Ordem decrescente: "+b+" "+a+" "+c);
        }else if(b>c && c>a){//b>c>a
            System.out.println("Ordem crescente: "+a+" "+c+" "+b);
            System.out.println("Ordem decrescente: "+b+" "+c+" "+a);
        }else if(c>a && a>b){//c>a>b
            System.out.println("Ordem crescente: "+b+" "+a+" "+c);
            System.out.println("Ordem decrescente: "+c+" "+a+" "+b);
        }else if(c>b && b>a){//c>b>a
            System.out.println("Ordem crescente: "+a+" "+b+" "+c);
            System.out.println("Ordem decrescente: "+c+" "+b+" "+a);
        }


    }
}
