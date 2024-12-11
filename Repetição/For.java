/*Números pares
Peça ao usuário um número inteiro positivo e exiba todos os números pares entre 1 e esse número.*/
import java.util.Scanner;
public class For{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            for (int i = 0; i < numero+1; i ++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        } else{
            System.out.println("Digite um número maior que zero!");
        }
        scanner.close();
    }
}