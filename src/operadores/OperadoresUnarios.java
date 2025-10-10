package operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int num1 = 5;
        int resultado1 = ++num1; //num1 é incrementado para 6 e depois atribuído a resultado
        System.out.println(num1); // imprime 6
        System.out.println(resultado1); // imprime 6

        int num2 = 5;
        int resultado2 = num2++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num2); // imprime 6
        System.out.println(resultado2); // imprime 5

    }
}
