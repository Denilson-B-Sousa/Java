import java.util.Scanner;

/*Faça um programa que receba o peso de uma pessoa, calcule e mostre o novo peso

a) o novo peso se a pessoa engordar 15% sobre o peso digitado;

b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
*/
public class Ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, novoPeso, novoPeso2, taxaEngordamento, taxaEmagrecimento ;
        System.out.println("Informe o seu peso: ");
        peso = input.nextDouble();

        taxaEngordamento = peso * 0.15; // 15 / 100

        taxaEmagrecimento = peso * 0.20; // 20 / 100

        novoPeso = peso + taxaEngordamento;
        novoPeso2 = peso - taxaEmagrecimento;

        System.out.println("O novo peso com 15% de engordamento: " + novoPeso);

        System.out.println("O novo peso com 20% de emagrecimento: " + novoPeso2);

    }
    
}
