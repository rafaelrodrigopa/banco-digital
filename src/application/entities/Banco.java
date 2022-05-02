package application.entities;

public class Banco {

	private String nome;
	private String agencia;


	public Banco() {}


	public Banco(String nome, String agencia) {
		super();
		this.nome = nome;
		this.agencia = agencia;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", agencia=" + agencia + "]";
	}


}
