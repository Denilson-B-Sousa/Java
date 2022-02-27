import java.util.Scanner;

/*Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que: A = lado * lado */

public class Ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado, area;

        System.out.println("Informe o valor de um dos lados do quadrado: ");
        lado = input.nextDouble();

        area = lado * lado;

        System.out.println("O lado do quadrado é igual a: " + area);
    }
    
}
