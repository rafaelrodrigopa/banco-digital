package application;

import java.util.Locale;

import application.entities.Banco;
import application.entities.Cliente;
import application.entities.Conta;
import application.entities.ContaCorrente;
import application.entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Cliente cliente01 = new Cliente("Rafael");
		
		Conta contaCorrente = new ContaCorrente(cliente01, new Banco("Santander", "01"));
		Conta contaPoupanca = new ContaPoupanca(cliente01, new Banco("Santander", "01"));
		
		contaCorrente.gerarNumeroDaConta();
		contaPoupanca.gerarNumeroDaConta();

		contaCorrente.imprimirInfosComuns();
		System.out.println("");
		contaPoupanca.imprimirInfosComuns();
		
		System.out.println("");
		System.out.print("OPERAÇÕES CONTA CORRENTE\n");
		
		System.out.print("Deposito: 800.00");
		contaCorrente.depositar(800.00);
		System.out.print(" - ");
		contaCorrente.imprimirExtrato();
		
		System.out.print("Saque: 350.00");
		contaCorrente.sacar(350.00);
		System.out.print(" - ");
		contaCorrente.imprimirExtrato();
		
		System.out.print("Transferência: 450.00"
				+ "");
		contaCorrente.transferir(450.00, contaPoupanca);
		System.out.print(" - ");
		contaCorrente.imprimirExtrato();
		
		System.out.println("");
		System.out.print("OPERAÇÕES CONTA POUPANÇA\n");
		contaPoupanca.imprimirExtrato();
		
		System.out.print("Saque: 50.00");
		contaPoupanca.sacar(50.00);
		System.out.print(" - ");
		contaPoupanca.imprimirExtrato();
		
	}

}
