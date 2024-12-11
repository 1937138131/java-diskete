// Verificar Positivo, Negativo ou Zero
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.print("Esse número é positivo");
        } else if (numero == 0){
            System.out.print("Esse número é neutro (zero)");
        } else{
            System.out.print("Esse número é negativo");
        }
        scanner.close();
    }
}