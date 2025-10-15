// Define o pacote onde este arquivo está (opcional, serve pra organizar seus códigos)
package desafios;

// Importa classes prontas do Java que vamos usar
import java.util.Random;  // Para gerar números aleatórios
import java.util.Scanner; // Para ler o que o usuário digita

// Cria uma classe pública chamada JogoAdivinhacao
public class JogoAdivinhacao {

    // Método principal — é aqui que o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto 'leitor' que vai capturar o que o usuário digitar no teclado
        Scanner leitor = new Scanner(System.in);

        // Gera um número aleatório entre 0 e 99 (porque nextInt(100) vai de 0 até 99)
        int numeroGerado = new Random().nextInt(100);

        // Variável que conta quantas tentativas o jogador já fez
        int tentativas = 0;

        // Variável que guarda o número que o jogador digita
        int numeroDigitado = 0;

        // Início do laço de repetição: roda enquanto o jogador ainda tiver tentativas (menos de 5)
        while (tentativas < 5) {

            // Mostra uma mensagem pedindo para o jogador digitar um número
            System.out.print("Digite um número entre 0 e 100: ");

            // Lê o número digitado e guarda na variável 'numeroDigitado'
            numeroDigitado = leitor.nextInt();

            // Aumenta o número de tentativas em 1
            tentativas++;

            // Verifica se o número digitado é igual ao número sorteado
            if (numeroDigitado == numeroGerado) {
                // Se for igual, mostra mensagem de acerto e termina o jogo com 'break'
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // Sai do laço 'while'
            }
            // Se o número digitado for menor que o número sorteado
            else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            }
            // Se o número digitado for maior que o número sorteado
            else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        // Depois que o laço termina, verifica se o jogador usou as 5 tentativas e não acertou
        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }

        // Fecha o leitor (boa prática para liberar o recurso do teclado)
        leitor.close();
    }
}
