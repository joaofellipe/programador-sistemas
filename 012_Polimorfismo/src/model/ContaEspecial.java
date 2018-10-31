package model;

public class ContaEspecial {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String titular, String agencia, String numeroConta, double saldo, double limite) {
		super();
		this.limite = limite;
	}

	@Override
	public double calcularSaldo() {
		double saldoFinal;
		saldoFinal = super.calcularSaldo() + limite;
		return saldoFinal;

	}

}
