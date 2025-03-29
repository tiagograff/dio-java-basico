package edu.tiago.banco;

public class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public void exibirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + "e seu saldo " + saldo + " já está disponível para saque.");
    }
}
