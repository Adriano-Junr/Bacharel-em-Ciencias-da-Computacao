package Main;

import java.util.Scanner;

public class Main {
//3. Faça um algoritmo que calcule o IMC- (Índice de massa corporal) de uma pessoa.
//IMC: P/H2 . Onde: P é o peso e H a altura
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println("-------Calcula IMC-------");
        System.out.print("Digite o peso: ");
        peso = Double.parseDouble(ler.nextLine());
        System.out.print("Digite a altura: ");
        altura = Double.parseDouble(ler.nextLine());
        imc = peso/(altura*2);
        System.out.printf("O seu IMC é %.2f",imc);
    }
}
