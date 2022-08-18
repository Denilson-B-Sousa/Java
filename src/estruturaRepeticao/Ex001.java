package estruturaRepeticao;
/*Faça um programa que calcule e mostre os números entre 1000 e 2000
 (inclusive) que, quando divididos por 11, produzam resto igual a 5*/
public class Ex001 {
    public static void main(String[] args){
        int i;
        for(i = 1000; i <= 2000; i++){
            if(i % 11 == 5){
                System.out.println("Números com resto 5: " + i);
            }
        }
    }
}
