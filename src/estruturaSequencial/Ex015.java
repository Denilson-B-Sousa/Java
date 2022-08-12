package estruturaSequencial;

import java.util.Scanner;

/*João recebeu seu salário e precisa pagar duas contas que estão atrasadas.
contas estão atrasadas. João terá de pagar multa de 2% sobre
 cada conta. Faça um programa que calcule e mostre quanto restará
 do salário do joão.*/
public class Ex015 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double salario, conta1, conta2, salarioFinal;

        System.out.println("Informe o valor do salário: R$");
        salario = input.nextDouble();
        System.out.println("Informe o valor da primeira conta: R$");
        conta1 = input.nextDouble();
        System.out.println("Informe o valor da segunda conta: R$ ");
        conta2 = input.nextDouble();

        conta1 = conta1 * 0.02; // 2 / 100
        conta2 = conta2 * 0.02; // 2 / 100
        salarioFinal = salario - (conta1 + conta2);

        System.out.println("O salário final é: R$" + salarioFinal);

    }
}
