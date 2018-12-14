package model;

public class Contato {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	private int id;
	private String nome;
	private String email;
	private String mensagem;

	public Contato(int id, String nome, String email, String mensagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}

	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contato(String nome, String email, String mensagem) {
		super();
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
