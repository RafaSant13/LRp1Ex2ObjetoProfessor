package view;

import model.ProfessorHorista;
import model.ProfessorTitular;

public class Principal {

	public static void main(String[] args) {
		ProfessorTitular pt = new ProfessorTitular();
		pt.setNome("Timóteo");
		pt.setMatricula("00001");
		pt.setIdade(45);
		pt.setAnosInstituicao(8);
		pt.setSalario(5000);
		
		System.out.println("Profesor " + pt.getNome()+" tem um salário de "+pt.calcSalario()+" reais");
		
		ProfessorHorista ph = new ProfessorHorista();
		ph.setNome("Horácio");
		ph.setMatricula("00002");
		ph.setIdade(30);
		ph.setHorasAula(200);
		ph.setValorHoraAula(15);
		
		System.out.println("Profesor " + ph.getNome()+" tem um salário de "+ph.calcSalario()+" reais");
	}

}
