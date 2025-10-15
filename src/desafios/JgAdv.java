package desafios;

// Importa as classes que vamos usar
import java.util.Random;  // Para gerar números aleatórios
import java.util.Scanner; // Para ler o que o usuário digita

public class JgAdv {
    public static void main(String[] args) {
        // Cria um leitor para capturar os números digitados pelo usuário no teclado
        Scanner leitor = new Scanner(System.in);

        // Gera um número aleatório entre 0 e 100
        // nextInt(101) vai de 0 até 100 (pois o 101 não é incluído)
        int numeroGerado = new Random().nextInt(101);

        // Contador de tentativas do jogador
        int tentativas = 0;

        // Variável para guardar o número que o jogador digitar
        int numeroDigitado = 0;

        // Mensagem inicial do jogo
        System.out.println("=== Jogo da Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 0 e 100!");

        // Enquanto o jogador ainda não fez 5 tentativas, o jogo continua
        while (tentativas < 5) {
            // Pede para o jogador digitar um número
            System.out.print("\nDigite seu palpite: ");

            // Lê o número que o jogador digitou e guarda em 'numeroDigitado'
            numeroDigitado = leitor.nextInt();

            // Aumenta o contador de tentativas em 1
            tentativas++;

            // Se o jogador acertar o número
            if (numeroDigitado == numeroGerado) {
                System.out.println("🎉 Parabéns! Você acertou em " + tentativas + " tentativas!");
                break; // Sai do laço 'while', pois o jogo acabou
            }
            // Se o número digitado for menor que o número gerado
            else if (numeroDigitado < numeroGerado) {
                System.out.println("O número é MAIOR que " + numeroDigitado + ".");
            }
            // Se o número digitado for maior que o número gerado
            else {
                System.out.println("O número é MENOR que " + numeroDigitado + ".");
            }
        }

        // Se o jogador não acertou o número em 5 tentativas
        if (numeroDigitado != numeroGerado) {
            System.out.println("\n😢 Acabaram suas tentativas. O número era: " + numeroGerado);
        }

        // Fecha o leitor para evitar vazamentos de recurso (boa prática)
        leitor.close();
    }
}


