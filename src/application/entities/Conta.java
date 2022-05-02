package application.entities;

import java.util.Random;

import application.entities.interfaces.IConta;

public abstract class Conta implements IConta {

	protected Banco banco;
	protected double saldo = 0.0;
	protected String numeroConta;
	protected Cliente cliente;
	
	public Conta(Cliente cliente, Banco banco) {
		this.cliente=cliente;
		this.banco=banco;
	}
	
	public void gerarNumeroDaConta() {
		Random random = new Random();
		int conta = random.nextInt();
		this.numeroConta = "000" + Math.abs(conta) + " - 6";
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public void imprimirInfosComuns() {
		System.out.print("Nome do cliente: " + cliente.getNome() + "\n");
		System.out.println("");
		System.out.print("Banco: " + banco.getNome() + "\n");
		System.out.print("Agencia: " + banco.getAgencia() + "\n");
		System.out.print("Conta: " + getNumeroConta() + "\n");
		
	}
	
	public void imprimirExtrato() {
		System.out.print("Saldo atual: " + getSaldo() + "\n");
	}

}
