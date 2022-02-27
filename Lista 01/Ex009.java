import java.util.Scanner;
 /*Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que: A = ((base maior + base menor) * altura)/2 */
public class Ex009 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double baseMaior, baseMenor, altura, area;

        System.out.println("Informe a Base Maior do trapézio: ");
        baseMaior = input.nextDouble();
        System.out.println("Informe a base menor do trapézio: ");
        baseMenor = input.nextDouble();
        System.out.println("Informe a altura do trapézio: ");
        altura = input.nextDouble();
        area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é igual a: " + area);

    }   
}
