import java.util.Scanner;
    /*Faça um programa que receba o preço de um produto, calcule e mostre o novo preço sabendo-se que ele sofreu um desconto de 10%. */
public class Ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double desconto , preco, novoPreco;

        System.out.println("Informe o preço atual:");
        preco = input.nextDouble();
        desconto = preco * 0.1; // 10 / 100 == 0.1
        novoPreco = preco - desconto;
        System.out.println("O novo preço do produto é: " + novoPreco);
    }
}
