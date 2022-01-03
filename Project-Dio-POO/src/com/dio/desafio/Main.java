package com.dio.desafio;

import com.dio.desafio.dominio.Curso;

public class Main {
public static void main(String[] args) {
	Curso matematica = new Curso();
	
	matematica.setTitulo("Resolução de calculos");
	matematica.setCargaHoraria(40);
	matematica.setDescricao("Matematica");
	System.out.println(matematica);
}
}
