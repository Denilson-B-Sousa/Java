package estruturaSequencial;

import java.util.Scanner;
    /*Faça um programa que receba duas notas, calcule e mostre a média aritmética das notas. */
public class Ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota, nota2, mediaAritmetica;

        System.out.println("Informe o valor da primeira nota:");
        nota = input.nextDouble();
        System.out.println("Informe o valor da segunda nota:");
        nota2 = input.nextDouble();

        mediaAritmetica = (nota + nota2) / 2;

        System.out.println("A média aritmética é igual a: " + mediaAritmetica);


        
    }
}
