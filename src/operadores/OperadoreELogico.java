package operadores;

public class OperadoreELogico {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // O operador && (E lógico) retorna true apenas se as duas condições forem verdadeiras.
        // Como 'a' é true e 'b' é false, o resultado será false.
        boolean resultado = a && b;

        System.out.println("a: " + a);                // Mostra o valor de a
        System.out.println("b: " + b);               // Mostra o valor de b
        System.out.println("a && b: " + resultado); // Mostra o resultado da operação lógica
    }
}

