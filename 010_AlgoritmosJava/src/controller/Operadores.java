package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {

		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");

		int nota1 = Teclado.lerInt("Digite sua nota: ");

		int nota2 = Teclado.lerInt("Digite sua nota: ");

		int nota3 = Teclado.lerInt("Digite sua nota: ");

		int nota4 = Teclado.lerInt("Digite sua nota: ");

		int media = nota1 + nota2 + nota3 + nota4;

		media = media / 4;

		System.out.println("Nome informado: " + nome);
		System.out.println("Media:" + media);

	}
}
