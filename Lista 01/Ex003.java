import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        double num1, num2, quociente;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro diferente de zero:");
        num1 = input.nextDouble();
        System.out.println("Digite outro número inteiro diferente de zero:");
        num2 = input.nextDouble();
        quociente = num1 / num2;

        System.out.println("A divisão entre os números é: " + quociente);
    }
}
