package com.poo.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DeleteAluno extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteAluno frame = new DeleteAluno();
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
	public DeleteAluno() {
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		Label label_1 = new Label("Matricula");
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(88, 90, 79, 38);
		getContentPane().add(label_1);
		
		TextField textField = new TextField();
		textField.setBounds(173, 90, 180, 38);
		getContentPane().add(textField);
		
		JButton btnCreate = new JButton("Delete");
		btnCreate.setBounds(168, 177, 117, 25);
		getContentPane().add(btnCreate);
		
		Aluno aluno = new Aluno();
		AlunoController controller = new AlunoController();
		
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {				
					
					aluno.setMatricula(textField.getText());
					
					controller.delete(aluno);
					JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso!");
				}
				
				 catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Erro ao deletar Aluno!");
				}
			}
		});

	}

}
