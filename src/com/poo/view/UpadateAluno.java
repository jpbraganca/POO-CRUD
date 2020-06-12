package com.poo.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class UpadateAluno extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpadateAluno frame = new UpadateAluno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpadateAluno() {
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		Label label = new Label("Nome");
		label.setBounds(56, 38, 58, 32);
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		getContentPane().add(label);
		
		Label label_1 = new Label("Matricula");
		label_1.setBounds(35, 91, 79, 32);
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		getContentPane().add(label_1);
		
		TextField textField = new TextField();
		textField.setBounds(120, 38, 268, 32);
		getContentPane().add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(120, 91, 268, 32);
		getContentPane().add(textField_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(172, 174, 117, 25);
		getContentPane().add(btnUpdate);
		
		Aluno aluno = new Aluno();
		AlunoController controller = new AlunoController();
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {				
					
					aluno.setName(textField.getText());
					aluno.setMatricula(textField_1.getText());
					
					controller.update(aluno);
					JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
				}
				
				 catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Erro ao atualizar Aluno!");
				}
			}
		});

	}

}
