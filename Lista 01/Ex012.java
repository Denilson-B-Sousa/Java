import java.util.Scanner;
import java.lang.Math;
 /*Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário:*/
public class Ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioMinimo, salarioFuncionario, quantSalarioMinimo;
        System.out.println("Informe o valor do salário mínimo: R$");
        salarioMinimo = input.nextDouble();

        System.out.println("Informe o valor do salário do funcionário: R$");
        salarioFuncionario = input.nextDouble();

        quantSalarioMinimo = (salarioFuncionario / salarioMinimo);

        System.out.println("A quantidade de salário mínimo recebido pelo funcionário é: " + Math.round(quantSalarioMinimo) + " Salários mínimos"); /* Método Math.round utilizado para converter double(real) para     int=(inteiro)*/
    }
}
