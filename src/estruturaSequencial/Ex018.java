package estruturaSequencial;

import java.util.Scanner;

/*Faça um programa que receba uma temperatura em Celsisus,
 calcule e mostre essa temperatura em Fahrenheit */
public class Ex018 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Informe a temperatura em Celsius: C°");
        celsius = input.nextInt();

        fahrenheit = (1.8 * celsius) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
    }
}
