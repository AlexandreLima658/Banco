package br.com.dio.banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(1000);
		
		Conta poupanca = new ContaPoupanca();
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
