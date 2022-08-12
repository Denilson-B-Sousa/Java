package estruturaSequencial;

import java.util.Scanner;

/*Faça um programa que receba o ano de nascimento de
uma pessoa e o ano atual, calcule e mostre:
a) idade da pessoa em anos;
b) idade da pessoa em meses;
c) idade da pessoa em dias;
d) a idade dessa pessoa em semanas
*/
public class Ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anoNascimento, anoAtual, idadeAnos, idadeMeses;
        double idadeDias, idadeSemanas;

        System.out.println("Informe o seu ano de nascimento: ");
        anoNascimento = input.nextInt();
        System.out.println("Informe o ano atual: ");
        anoAtual = input.nextInt();

        idadeAnos = anoAtual - anoNascimento;
        idadeMeses = idadeAnos * 12;
        idadeSemanas = idadeMeses * 4.3482;
        idadeDias = idadeAnos * 365;

        System.out.println("A sua idade em anos é: " + idadeAnos + " anos.");
        System.out.println("A sua idade em meses é: " + idadeMeses + " meses.");
        System.out.println("A sua idade em Semanas é: " + idadeSemanas + " semanas.");
        System.out.println("A sua idade em dias é: " + idadeDias + " dias.");





    }
    
}
