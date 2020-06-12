package com.poo.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.Button;
import javax.swing.JButton;

public class CreateAluno extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAluno frame = new CreateAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	
	public CreateAluno() {
		setClosable(true);
		setBounds(100, 100, 491, 324);
		getContentPane().setLayout(null);
		
		Label label = new Label("Nome");
		label.setBounds(73, 79, 53, 38);
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		getContentPane().add(label);
		
		Label label_1 = new Label("Matricula");
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(47, 157, 79, 38);
		getContentPane().add(label_1);
		
		TextField textField = new TextField();
		textField.setBounds(132, 157, 265, 38);
		getContentPane().add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(132, 79, 265, 38);
		getContentPane().add(textField_1);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(199, 232, 117, 25);
		getContentPane().add(btnCreate);
		
		Aluno aluno = new Aluno();
		AlunoController controller = new AlunoController();
		
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {				
					
					aluno.setName(textField.getText());
					aluno.setMatricula(textField_1.getText());
					
					controller.create(aluno);
					JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso!");
				}
				
				 catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Erro ao Inserir Aluno!");
				}
			}
		});

	}
}
