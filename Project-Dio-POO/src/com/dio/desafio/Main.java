package com.dio.desafio;

import com.dio.desafio.dominio.Conteudo;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {
public static void main(String[] args) {
	Curso matematica = new Curso();
	
	matematica.setTitulo("Resolução de calculos");
	matematica.setCargaHoraria(40);
	matematica.setDescricao("Matematica");
	System.out.println(matematica);
	
	Conteudo dio = new Mentoria();
	dio.setDescricao("Melhor bootcamp");
	dio.setTitulo("Inter");
	
	System.out.println(dio.toString());
	
}
}
