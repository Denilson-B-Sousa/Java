package estruturaSequencial;

import java.util.Scanner;
 /*Faça um programa que calcule e mostre a área de um losango. Sabe-se que: A = (diagonal maior * diagonal menor)/2 */
public class Ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diagonalMaior, diagonalMenor, area;
        System.out.println("Informe a diagonal maior: ");
        diagonalMaior = input.nextDouble();

        System.out.println("Informe a diagonal menor: ");
        diagonalMenor = input.nextDouble();

        area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("O valor da área do losango é igual a: " + area);


    }
    
}
