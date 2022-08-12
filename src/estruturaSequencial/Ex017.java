package estruturaSequencial;

import java.util.Scanner;

/*Faça um programa que receba o raio, calcule e mostre: */
public class Ex017 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double raio, area, volume, comprimento;

        System.out.println("Informe o raio da circunferência:");
        raio = input.nextDouble();


        comprimento = 2 * Math.PI * raio;
        area = 4 * Math.PI * Math.pow(raio, 2);
        volume =  4 * Math.PI * Math.pow(raio, 3) / 3;

        System.out.println("O comprimento da esfera é: " + Math.round(comprimento)+ " U²");
        System.out.println("A área da esfera é: " + Math.round(area) + " U²");
        System.out.println("O volume da esfera é: " + Math.round(volume) + " U³");

    }
}
