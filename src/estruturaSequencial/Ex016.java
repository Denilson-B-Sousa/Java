package estruturaSequencial;

import java.util.Scanner;

/*Faça um programa que receba um dos catetos do triângulo
calcule e mostre quanto restará do salário do João */
public class Ex016 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double catetoOposto, catetoAdjascente, hipotenusa = 0;

        System.out.println("Informe o valor do cateto Oposto:");
        catetoOposto = input.nextInt();
        System.out.println("Informe o valor do cateto Adjascente:");
        catetoAdjascente = input.nextInt();

        hipotenusa = Math.pow(catetoAdjascente, 2) + Math.pow(catetoOposto, 2);

        System.out.println("O valor da hipotenusa é: " + Math.sqrt(hipotenusa));
    }
}
