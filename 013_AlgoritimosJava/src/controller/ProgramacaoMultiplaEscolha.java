package controller;

import util.Teclado;

public class ProgramacaoMultiplaEscolha {
	public static void main(String[] args) {
		int matr, numFinal;
		matr = Teclado.lerInt("Informe matr�cula");
		numFinal = matr%10;
		switch (numFinal) {
		case 0:
			System.out.println("Pagamento em Janeiro");
			break;
		case 1:
			System.out.println("Pagamento em Fevereiroi");
			break;
		case 2:
			System.out.println("Pagamento em Mar�o");
			break;
		case 3:
			System.out.println("Pagamento em Abril");
			break;
		case 4:
			System.out.println("Pagamento em Maio");

		}

	}
}
