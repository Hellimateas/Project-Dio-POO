package com.dio.desafio;

import com.dio.desafio.dominio.BootCamp;
import com.dio.desafio.dominio.Conteudo;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class Main {
public static void main(String[] args) {
	Curso matematica = new Curso();
	
	matematica.setTitulo("Resolução de calculos");
	matematica.setCargaHoraria(40);
	matematica.setDescricao("Matematica");

	
	Conteudo dio = new Mentoria();
	dio.setDescricao("Melhor bootcamp");
	dio.setTitulo("Inter");
	
	
	BootCamp bootcamp = new BootCamp();
	bootcamp.setNome("Java Tech Developer");
	bootcamp.setDescricao("vem ser Tech");
	bootcamp.getConteudos().add(matematica);
	bootcamp.getConteudos().add(dio);
	
	Dev hellimateas = new Dev();
	hellimateas.setNome("Hellimateas");
	hellimateas.inscreverBootcamp(bootcamp);
	System.out.println("Conteudos inscritos" + hellimateas.getConteudosInscritos());
	System.out.println("Conteudos concluidos" + hellimateas.getConteudosConcluidos());
	
	Dev felipe = new Dev();
	felipe.setNome("Felipe Barros");
	System.out.println("Conteudos Inscritos" + felipe.getConteudosInscritos());
}
}
