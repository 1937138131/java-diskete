import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int numero;

        do {
            numero = random.nextInt(10) + 1; // Gera um número aleatório entre 1 e 10
            System.out.println("Número gerado: " + numero);
        } while (numero != 7); // Continua enquanto o número não for 7

        System.out.println("Número 7 encontrado! Encerrando...");
    }
}
