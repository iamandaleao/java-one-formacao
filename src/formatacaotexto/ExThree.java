package formatacaotexto;

//Examplo: Usando .format

public class ExThree {
    public static void main(String[] args) {
        String nome = "Amanda";
        String data = "2027-08-01";
        String email = String.format("Prezado(a) %s,\n\n" +
                "Gostaríamos de informar que sua assinatura expira em %s.\n\n" +
                "Atenciosamente,\nEquipe de Suporte", nome, data);
        System.out.println(email);
    }
}

// Examplo: Usando .formatted (mais legível com Text Blocks):

/*String nome = "Amanda";
String data = "2027-08-01";
String email = """
               Prezado(a) %s,

               Gostaríamos de informar que sua assinatura expira em %s.

               Atenciosamente,
               Equipe de Suporte
               """.formatted(nome, data);
System.out.println(email);*/