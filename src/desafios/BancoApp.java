package desafios;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class Conta {
    private String nome;
    private String tipoConta;
    private double saldo;

    private final NumberFormat moeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public Conta(String nome, String tipoConta, double saldoInicial) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldoInicial;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + moeda.format(saldo));
    }

    public void receberValor(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. Informe um valor maior que zero.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito realizado: " + moeda.format(valor));
        consultarSaldo();
    }

    public void transferirValor(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. Informe um valor maior que zero.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
            consultarSaldo();
            return;
        }
        saldo -= valor;
        System.out.println("Transferência realizada: " + moeda.format(valor));
        consultarSaldo();
    }

    // Getters (se precisar)
    public String getNome() { return nome; }
    public String getTipoConta() { return tipoConta; }
    public double getSaldo() { return saldo; }
}

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados iniciais do cliente
        Conta conta = new Conta("Amanda Leão", "Corrente", 2500.00);

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Tipo conta: " + conta.getTipoConta());
        System.out.println("Saldo inicial: R$ 2500,00");
        System.out.println("***********************");
        System.out.println();

        boolean rodando = true;

        while (rodando) {
            System.out.println();
            System.out.println("Operações");
            System.out.println();
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("\nDigite a opção desejada: ");

            String opcao = scanner.nextLine().trim();

            switch (opcao) {
                case "1":
                    conta.consultarSaldo();
                    break;

                case "2":
                    System.out.print("\nInforme o valor a receber: ");
                    try {
                        double valorReceber = lerDoubleValido(scanner);
                        conta.receberValor(valorReceber);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Use apenas números (ex: 700 ou 700.50).");
                        scanner.nextLine(); // limpar buffer
                    }
                    break;

                case "3":
                    System.out.print("\nInforme o valor que deseja transferir: ");
                    try {
                        double valorTransferir = lerDoubleValido(scanner);
                        conta.transferirValor(valorTransferir);
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Use apenas números (ex: 1000 ou 1000.00).");
                        scanner.nextLine(); // limpar buffer
                    }
                    break;

                case "4":
                    System.out.println("Encerrando aplicação. Até mais!");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    /**
     * Lê um double do scanner a partir de uma linha, tratando vírgula como separador decimal comum no BR
     * e lançando InputMismatchException em caso de valor inválido.
     */
    private static double lerDoubleValido(Scanner scanner) {
        String linha = scanner.nextLine().trim();
        // substitui vírgula por ponto para permitir entradas como "700,50"
        linha = linha.replace(",", ".");
        if (linha.isEmpty()) {
            throw new InputMismatchException();
        }
        try {
            return Double.parseDouble(linha);
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }
}

