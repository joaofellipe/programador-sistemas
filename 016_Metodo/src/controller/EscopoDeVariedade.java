package controller;

public class EscopoDeVariedade {
	public static void metodoA() {
		int x = 25;
		System.out.println("Vari�vel local x ao entrar no metodoA � " + x);
		x = x + 1;
		System.out.println("Vari�vel local x antes de sair do metodoA � " + x);
	}

	public static void main(String[] args) {
		metodoA();
		metodoB();
		int x = 5;
		System.out.println("x no in�cio de main() � " + x);
		metodoA();
		metodoB();

	}

	public static void metodoB() {
		double x = 17;
		System.out.println("Variavel local x ao entrar no metodoB � " + x + " goblal.");
		x = x * 10;
		System.out.println("Vari�vel x antes de sair do metodoB � " + x);
	}

	public static void metodoB(int x) {
		metodoB();
		x = 5;
		System.out.println("x no in�cio de main() � " + x);
	}

}