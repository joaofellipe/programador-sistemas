package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Teclado {

	
	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	public static String LerTexto(String texto) {
	
	  try {
		  
		System.out.println(texto);
		
		return teclado.readLine();
	  }
		  catch (IOException e) {
	  
			  return null;	  
	 }
		// TODO: handle exception
	
	
	}
   
   public static int Lerint(String texto ){
    	
    	// chama po metodo lerString o resultado
	   
      return Integer.parseInt(LerTexto(texto)); 	
    	
   } 
	  
   public static double Lerdouble(String texto ){
   	
   	// chama po metodo lerString o resultado
	   
     return Double.parseDouble(LerTexto(texto)); 	
   	
   }
   
     
	
	
}
