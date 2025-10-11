package formatacaotexto;

public class DemoJavaModern {

    // Record para representar dados de passagem aérea
    public record PassagemAerea(String origem, String destino, double preco) {}

    // Classe de exemplo para notificação
    public static class Email {
        String destino;
        String assunto;
        public Email(String destino, String assunto) { this.destino = destino; this.assunto = assunto; }
    }

    public static class SMS {
        String numero;
        String mensagem;
        public SMS(String numero, String mensagem) { this.numero = numero; this.mensagem = mensagem; }
    }

    // Método para processar notificações
    public static String processarNotificacao(Object notificacao) {
        return switch (notificacao) {
            case Email e -> "Enviando email para " + e.destino + " sobre: " + e.assunto;
            case SMS s -> "Enviando SMS para " + s.numero;
            case String s -> "Notificação de sistema: " + s;
            case null, default -> "Tipo de notificação desconhecida";
        };
    }

    public static void main(String[] args) {

        // Text block para montar um JSON de um evento local
        var payloadEvento = """
        {
            "nome": "Festa de São João",
            "local": "Pelourinho, Salvador",
            "data": "2025-06-23",
            "atracoes": [
                "Forró do Tico",
                "Adelmário Coelho"
            ]
        }
        """;

        System.out.println(payloadEvento);

        // Exemplo de uso do record
        PassagemAerea passagem = new PassagemAerea("Salvador", "São Paulo", 350.50);
        System.out.println("Passagem de " + passagem.origem() + " para " + passagem.destino() + " custa R$" + passagem.preco());

        // Exemplo de uso do processarNotificacao
        System.out.println(processarNotificacao(new Email("teste@teste.com", "Assunto Teste")));
        System.out.println(processarNotificacao(new SMS("11999999999", "Mensagem")));
        System.out.println(processarNotificacao("Sistema offline"));
    }
}
