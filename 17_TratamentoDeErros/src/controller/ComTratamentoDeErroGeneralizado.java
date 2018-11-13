package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComTratamentoDeErroGeneralizado {
	public static void main(String[] args) {
		int va11 = obtemNumero("primeiro");
		int va12 = obtemNumero("segunda");
		System.out.println("Números lidos: " + va11 + "e" + va12);

	}

	static int obtemNumero(String n) {
		System.out.println("Digite o" + n + "numero");
		return lerNumero();
	}

	static int lerNumero() {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(teclado.readLine());
		return x;
	}

}
