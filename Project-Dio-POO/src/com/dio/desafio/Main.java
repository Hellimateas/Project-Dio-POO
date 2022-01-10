package com.dio.desafio;

import com.dio.desafio.dominio.BootCamp;
import com.dio.desafio.dominio.Conteudo;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso matematica = new Curso();

		matematica.setTitulo("Matem�tica");
		matematica.setCargaHoraria(40);
		matematica.setDescricao("Resolu��o de c�lculos matem�ticos");

		Curso portugues = new Curso();
		portugues.setTitulo("L�ngua Portuguesa");
		portugues.setDescricao("Estudo b�sico de como a l�gua portuguesa est� e �");
		portugues.setCargaHoraria(60);

		Mentoria dio = new Mentoria();
		dio.setDescricao("Melhor bootcamp");
		dio.setTitulo("Spread");

		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Java Tech Developer");
		bootcamp.setDescricao("vem ser Tech");
		bootcamp.getConteudos().add(matematica);
		bootcamp.getConteudos().add(dio);

		BootCamp bootcampPortugues = new BootCamp();
		bootcampPortugues.getConteudos().add(portugues);
		bootcampPortugues.getConteudos().add(dio);

		Dev hellimateas = new Dev();
		hellimateas.setNome("Hellimateas");
		hellimateas.inscreverBootcamp(bootcamp);
		System.out.println("----------------Ficha do " + hellimateas.getNome() + "----------------------\n");
		System.out.println("Nome: " + hellimateas.getNome());
		System.out.println("Data Inicial: " + bootcamp.getDataInicial());

		System.out.println("\nConte�dos Inscritos: ");
		for (Conteudo nome : hellimateas.getConteudosInscritos()) {
			System.out.println(nome);
		}
		System.out.println("\nConteudos conclu�dos: ");
		if (hellimateas.getConteudosConcluidos().isEmpty()) {
			System.out.println("N�o terminou nenhum Conte�do");
		} else {
			for (Conteudo nome : hellimateas.getConteudosConcluidos()) {
				System.out.println(nome);
			}
		}

		Dev felipe = new Dev();
		felipe.setNome("Felipe Barros");
		felipe.inscreverBootcamp(bootcampPortugues);
		System.out.println("\n----------------Ficha do " + felipe.getNome() + "---------------------\n");
		System.out.println("Nome: " + felipe.getNome());
		System.out.println("Data Inicial: " + bootcamp.getDataInicial());
		System.out.println("\nConte�dos Inscritos: ");
		for (Conteudo nome : felipe.getConteudosInscritos())
			System.out.println(nome);

		System.out.println("\nTerminou um conte�do! ");
		felipe.progredir();
		
		System.out.println("\nConte�dos conclu�dos");
		if(felipe.getConteudosConcluidos().isEmpty()) {
			System.out.println("N�o terminou, ainda, nenhum conte�do!");
		} else {
			for(Conteudo nome: felipe.getConteudosConcluidos()) System.out.println(nome);
		}

	}

}
