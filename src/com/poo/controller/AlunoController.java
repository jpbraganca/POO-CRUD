package com.poo.controller;

import java.util.ArrayList;

import java.util.List;

import com.poo.model.Aluno;
import com.poo.dao.AlunoDAO;

public class AlunoController {
	public void create(Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			
			dao.create(aluno);
		}catch(Exception e) {
			System.out.println("Erro no controller");
		}
		finally {
			System.out.println("Fim da insercao");
		}
	}
	
	public List<Aluno> readAll(){
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			AlunoDAO dao = new AlunoDAO();
			alunos = dao.readAll();
		}finally {
			//System.out.println("Fim da Leitura");
		}
		return alunos;
	}
	
	public void update(Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			dao.update(aluno);
			
		}catch(Exception e) {
			System.out.println("Erro no controller");
		}
		finally {
			System.out.println("Fim do update");
		}
	}
	
	public void delete(Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			
			dao.delete(aluno);
		}catch(Exception e) {
			System.out.println("Erro no controller");
		}finally {
			System.out.println("Fim do delete");
		}
	}
}
