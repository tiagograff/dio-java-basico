package edu.tiago.banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Conta conta = new Conta();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        conta.numero = scanner.nextInt();

        System.out.println("Agora digite a agência: ");
        conta.agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        conta.nomeCliente = scanner.next();

        System.out.println("Por último, digite o saldo: ");
        conta.saldo = scanner.nextDouble();

        scanner.close();

        conta.exibirMensagem();
    }
}
