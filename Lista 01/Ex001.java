import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, subtracao;
        System.out.println("Digite o primeiro número:");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo número:");
        num2 = input.nextDouble();

        subtracao = num1 - num2;
        System.out.println("A subtração é igual a:" + subtracao);
        
    }
}