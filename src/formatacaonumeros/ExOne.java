package formatacaonumeros;

public class ExOne {
    public static void main(String[] args) {
        double valor = 123.456789;
        String valorFormatado = String.format("O valor é: %.2f", valor);
        System.out.println(valorFormatado); // Saída: O valor é: 123.46
    }
}

//Usando .formatted:

//double valor = 123.456789;
//String valorFormatado = "O valor é: %.2f".formatted(valor);
//System.out.println(valorFormatado); // Saída: O valor é: 123.46