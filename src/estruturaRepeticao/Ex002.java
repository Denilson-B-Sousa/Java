package estruturaRepeticao;

import java.util.Scanner;

/*Faça um programa que leia um valor n, inteiro e positivo
calcule e mostre a seguinte soma*/
public class Ex002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i, valor;
        float soma = 0;

        System.out.println("Informe um valor: ");
        valor = input.nextInt();

        for(i = 1; i < valor; i++){
               soma = 1 + 1/i;
        }
        System.out.println("A soma dos valores é: " + soma);
    }
}
