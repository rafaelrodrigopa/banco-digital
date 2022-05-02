package application.entities;

public class ContaCorrente extends Conta {

	private Double limiteEmprestimo = 300.00;
	
	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void imprimirInfosComuns() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	// pegar emprestimo
	public void pegarEmprestimoAutomatico() {
		super.saldo += limiteEmprestimo;
	}
	
	// Paga 15% de juros
	public void pagarEmprestimoAutomatico() {
		super.saldo -= (limiteEmprestimo * 1.15);
	}
}
