package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.UIManager;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class AlunoSwing extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoSwing frame = new AlunoSwing();
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
	public AlunoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 429);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAction = new JMenu("Action");
		mnAction.setBackground(UIManager.getColor("Button.darkShadow"));
		menuBar.add(mnAction);
		
		JMenuItem mntmCreate = mnAction.add(action);
		mntmCreate.setText("Create");
		
		JMenuItem mntmRead = mnAction.add(action_2);
		mntmRead.setText("Read");
		
		JMenuItem mntmUpdate_1 = mnAction.add(action_1);
		mntmUpdate_1.setText("Update");
		
		JMenuItem mntmDelete = mnAction.add(action_3);
		mntmDelete.setText("Delete");
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			CreateAluno telaCad = new CreateAluno();
			contentPane.add(telaCad);
			telaCad.setVisible(true);
			
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			UpadateAluno telaUpdate = new UpadateAluno();
			contentPane.add(telaUpdate);
			telaUpdate.setVisible(true);
			
			
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "SwingAction_2");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "SwingAction_3");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			DeleteAluno telaDelete = new DeleteAluno();
			contentPane.add(telaDelete);
			telaDelete.setVisible(true);
		}
	}
}
