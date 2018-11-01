package controller;

public class EscopoDeVariedade {
	public static void metodoA() {
		int x = 25;
		System.out.println("Variável local x ao entrar no metodoA é " + x);
		x = x + 1;
		System.out.println("Variável local x antes de sair do metodoA é " + x);
	}

	public static void main(String[] args) {
		metodoA();
		metodoB();
		int x = 5;
		System.out.println("x no início de main() é " + x);
		metodoA();
		metodoB();

	}

	public static void metodoB() {
		double x = 17;
		System.out.println("Variavel local x ao entrar no metodoB é " + x + " goblal.");
		x = x * 10;
		System.out.println("Variável x antes de sair do metodoB é " + x);
	}

	public static void metodoB(int x) {
		metodoB();
		x = 5;
		System.out.println("x no início de main() é " + x);
	}

}