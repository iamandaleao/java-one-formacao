package operadores;

public class OperadorNegacao {
    public static void main(String[] args) {
        boolean a = true;

        // O operador ! (negação) inverte o valor de a
        // Como a é true, !a será false
        boolean resultado = !a;

        System.out.println("a: " + a);             // Mostra o valor original de a
        System.out.println("!a (negação de a): " + resultado); // Mostra o valor negado
    }
}

