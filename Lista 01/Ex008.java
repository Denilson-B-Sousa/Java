import java.util.Scanner;

    /*Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre o peso em gramas.*/
public class Ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, pesoGramas;
        System.out.println("Informe o seu peso em Kg:");
        peso = input.nextDouble();

        pesoGramas = peso * 1000;

        System.out.println("O seu peso em gramas é: " + pesoGramas + " gramas");


    }
    
}
