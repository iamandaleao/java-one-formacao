package formatacaotexto;

// Example: Usando .format

public class ExTwo {
    public static void main(String[] args) {
        String nome = "Amanda";
        int idade = 28;
        String mensagem = String.format("Olá, %s! Você tem %d anos.", nome, idade);
        System.out.println(mensagem); // Saída: Olá, Amanda! Você tem 28 anos.
    }
}

// Example: Usando .formatted (mais legível com Text Blocks):

//String nome = "Amanda";
//int idade = 28;
//String mensagem = "Olá, %s! Você tem %d anos.".formatted(nome, idade);
//System.out.println(mensagem); // Saída: Olá, Amanda! Você tem 28 anos.
