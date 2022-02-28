import java.util.Scanner;
/*Faça um programa que calcule e monte a tabela de um número digitado pelo usuário. */
public class Ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i;
        
        System.out.println("Informe um número:");
        num = input.nextInt();
        for (i = 0; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        

        /*Nesse caso a estrutura ideal seria a estrutura de repetição for */

    }
    
}
