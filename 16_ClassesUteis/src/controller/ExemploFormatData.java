package controller;

public class ExemploFormatData {
	public static void maim(String[] args) {
		Date data = new Date();
		System.out.println("Data " + data);
		
		@Deprecated
		Date dataInserida = new Date(2011,9,14);
		System.out.println("Data Inserida" + dataInserida);
		//Esta Classe está obsoleta.
		Calendar data2 = new GregorianCalendar();
		System.out.println("Data: " + data2);
	}

}
