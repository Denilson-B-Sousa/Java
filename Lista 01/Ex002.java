import java.util.Scanner;
    /*Faça um programa que receba três números, calcule e mostre a multiplicação desses números */
public class Ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, produto;
        System.out.println("Digite o primeiro número:");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo número:");
        num2 = input.nextDouble();
        System.out.println("Digite o terceiro número:");
        num3 = input.nextDouble();

        produto = num1 * num2 * num3;

        System.out.println("A multiplicação entre os números digitados é: " + produto);
    }
}