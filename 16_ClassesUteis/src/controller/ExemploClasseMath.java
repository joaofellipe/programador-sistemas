package controller;

public class ExemploClasseMath {
	public static void main(String[] args) {
		double valSorteado = Math.random();
		int resultado = 50 + (int) (valSorteado * 30);
		System.out.println("Sorteio entre 50 e 80: " + resultado);

		for (int i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int) (numeroSena * 61);
			System.out.println("N�mero Sorteado: " + numeroSorteado);

			double sen, cos, tan;
			double a = 60;
			sen = Math.sin(Math.toRadians(a));
			cos = Math.cos(Math.toRadians(a));
			tan = Math.tan(Math.toRadians(a));
			System.out.println("Seno: " + sen);
			System.out.println("cosseno: " + cos);
			System.out.println("Tangente: " + tan);

			double raiz = Math.sqrt(4);
			System.out.println("Raiz quadrada de 4 � " + raiz);
		}
	}

}