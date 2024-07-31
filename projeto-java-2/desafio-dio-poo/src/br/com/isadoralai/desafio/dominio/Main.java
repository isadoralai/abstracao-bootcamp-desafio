package br.com.isadoralai.desafio.dominio;

import br.com.isadoralai.desafio.dominio.Conteudo;
import br.com.isadoralai.desafio.dominio.Curso;
import br.com.isadoralai.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devIsadora = new Dev();
		devIsadora.setNome("Isadora");
		devIsadora.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Isadora" + devIsadora.getConteudosInscritos());
		devIsadora.progredir();
		devIsadora.progredir();
		
		System.out.println("----------------------------------------");
		System.out.println("Conteúdos Concluidos Isadora" + devIsadora.getConteudosConcluidos());
		System.out.println("XP:" + devIsadora.calcularTotalXp());
		
		Dev devEmilly = new Dev();
		devEmilly.setNome("Emilly");
		devEmilly.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Emilly" + devEmilly.getConteudosInscritos());
		devEmilly.progredir();
		devEmilly.progredir();
		devEmilly.progredir();
		System.out.println("----------------------------------------");
		System.out.println("Conteúdos Inscritos Emilly" + devIsadora.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Emilly" + devEmilly.getConteudosConcluidos());
		System.out.println("XP:" + devEmilly.calcularTotalXp());
		
		
			
	}

}
