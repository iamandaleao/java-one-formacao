package operadores;

public class OperadorOrLogico {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // O operador || (OU lógico) retorna true se pelo menos uma condição for verdadeira
        boolean resultado = a || b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a || b: " + resultado);
    }
}
