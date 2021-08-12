package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double horaTrab, salMin;
        //Receber hora
        do{
            System.out.print("Digite a quantidade de horas trabalhadas: ");
            horaTrab = Double.parseDouble(ler.nextLine());
            if(horaTrab <= 0.00)
                System.out.println("Erro! Hora inválida, tente novamente.");
        }while(horaTrab <=0.00);
        //Receber salário
        do{
            System.out.print("Digite o valor do salário minímo: ");
            salMin = Double.parseDouble(ler.nextLine());
            if(salMin <= 0.00)
                System.out.println("Erro! Valor inválido, tente novamente.");
        }while(salMin<=0.00);
        double valorHora, salBruto, imposto, salReceber;
        valorHora = salMin*0.1;
        salBruto = valorHora * horaTrab;
        imposto = salBruto * 0.03;
        salReceber = salBruto - imposto;
        System.out.printf("O salário a receber é %.2f\n", salReceber);
    }
}
