package controller;

import model.Aluno;
import model.Professor;

public class Teste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Jo�o Mendes Silva", "10099876-", "035568843-06", "21-87553456", "jmendes_silva@gmail.com", "10001", "T�cnico de TI");
		System.out.println(aluno.getNome());
		Professor professor = new Professor("Marcelo Roberto Campos", "10054987-7", "075598845-75", "21-7793-8574", "mrcampos@senai.rj.gov.br", 	"901", "TI");
	    System.out.println(professor.getNome());
	}

}
