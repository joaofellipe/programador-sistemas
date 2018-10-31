package model;

public class Professor extends Pessoa {
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	private String matricula;
	private String segmento;

	public Professor() {
		super();
	}

	public Professor(String nome, String rg, String cpf, String telefone, String email, String segmento,
			String matricula) {
		super();
		this.matricula = matricula;
		this.segmento = segmento;

	}
}
