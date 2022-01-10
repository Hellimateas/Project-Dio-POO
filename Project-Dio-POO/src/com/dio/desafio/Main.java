package com.dio.desafio;

import com.dio.desafio.dominio.BootCamp;
import com.dio.desafio.dominio.Conteudo;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso matematica = new Curso();

		matematica.setTitulo("Matemática");
		matematica.setCargaHoraria(40);
		matematica.setDescricao("Resolução de cálculos matemáticos");

		Curso portugues = new Curso();
		portugues.setTitulo("Língua Portuguesa");
		portugues.setDescricao("Estudo básico de como a lígua portuguesa está e é");
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

		System.out.println("\nConteúdos Inscritos: ");
		for (Conteudo nome : hellimateas.getConteudosInscritos()) {
			System.out.println(nome);
		}
		System.out.println("\nConteudos concluídos: ");
		if (hellimateas.getConteudosConcluidos().isEmpty()) {
			System.out.println("Não terminou nenhum Conteúdo");
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
		System.out.println("\nConteúdos Inscritos: ");
		for (Conteudo nome : felipe.getConteudosInscritos())
			System.out.println(nome);

		System.out.println("\nTerminou um conteúdo! ");
		felipe.progredir();
		
		System.out.println("\nConteúdos concluídos");
		if(felipe.getConteudosConcluidos().isEmpty()) {
			System.out.println("Não terminou, ainda, nenhum conteúdo!");
		} else {
			for(Conteudo nome: felipe.getConteudosConcluidos()) System.out.println(nome);
		}

	}

}
