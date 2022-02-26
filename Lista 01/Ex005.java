import java.util.Scanner;
    /*Faça um programa que receba duas notas, calcule e mostre a média ponderada das notas, considerando peso 2 para a primeira nota e peso 3 para a segunda nota. */
public class Ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota, nota2, mediaPonderada;
        int peso, peso2;
        System.out.println("Informe a primeira nota:");
        nota = input.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = input.nextDouble();

        peso = 2;
        peso2 = 3;

        mediaPonderada = ((nota * peso) + (nota2 * peso2)) / 2 + 3;
        
        System.out.println("A média ponderada é igual a: " + mediaPonderada);




    }
}
