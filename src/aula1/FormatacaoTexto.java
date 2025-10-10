package aula1;

public class FormatacaoTexto {
    public static void main(String[] args) {
        String nome = "Amanda";
        int idade = 28;
        double valor = 55.9999;

        System.out.println(String.format(
                "Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais",
                nome, idade, valor
        ));
    }
}
