package aula1;

// Nome da classe: VerificaSenha
// O nome do arquivo deve ser VerificaSenha.java
public class VerificaSenha {

    // Métd principal: ponto de entrada do programa
    public static void main(String[] args) {

        // Declarando a senha fixa
        String senha = "12345";

        // Estrutura condicional: verifica se a senha digitada é igual a "12345"
        // Para comparar Strings, sempre use .equals() e não ==

        if (senha.equals("12345")) {
            // Se for igual, imprime mensagem de acesso autorizado
            System.out.println("Acesso autorizado!");
        } else {
            // Se for diferente, imprime mensagem de senha incorreta
            System.out.println("Senha incorreta.");
        }
    }
}

