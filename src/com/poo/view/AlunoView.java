package com.poo.view;

import java.util.Scanner;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

public class AlunoView {
	
	public void create() {
		try {
			Scanner sc = new Scanner(System.in);
			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			
			System.out.println("Entre com a matricula:");
			aluno.setMatricula(sc.nextLine());
			
			System.out.println("Entre com o nome:");
			aluno.setName(sc.nextLine());
			
			controller.create(aluno);
			
		}catch (Exception e) {
			System.out.println("Erro na tela de incluir aluno");
		}
	}
	
	public void readAll() {
		AlunoController controller = new AlunoController();
		
		System.out.println("Listagem de Alunos");
		System.out.println("*******************");
		
		for(Aluno aluno:controller.readAll()) {
			System.out.println("Matricula: " + aluno.getMatricula());
			System.out.println("Nome: " + aluno.getName());
			System.out.println("----------------------------------");
		}
	}
	
	public void update() {
		try {
			//String nome, matricula;
			Scanner sc = new Scanner(System.in);
			AlunoController controller = new AlunoController();
			Aluno aluno = new Aluno();
			
			System.out.println("\n--------------------------\nAtualizar nome via matricula\n--------------------------\n");
			System.out.println("Entre com a matricula do aluno que deseja alterar");
			aluno.setMatricula(sc.nextLine());
			
			System.out.println("Entre com o novo nome do aluno");
			aluno.setName(sc.nextLine());
			
			controller.update(aluno);
			
		}catch(Exception e) {
			System.out.println("Erro ao atualizar aluno");
		}
	}
	
	public void delete() {
		try {
			//String matricula;
			Scanner sc = new Scanner(System.in);
			AlunoController controller = new AlunoController();
			Aluno aluno = new Aluno();
			
			System.out.println("Entre com a matricula para excluir");
			aluno.setMatricula(sc.nextLine());
			controller.delete(aluno);
			
			
		}catch(Exception e) {
			System.out.println("Erro ao deletar aluno");
		}
	}
	
	public static void main(String[] args) {
		AlunoView crud = new AlunoView();
		
		crud.create();
		crud.readAll();
		crud.update();
		crud.readAll();
		crud.delete();
		crud.readAll();
		crud.create();
		crud.readAll();
		
	}
}
