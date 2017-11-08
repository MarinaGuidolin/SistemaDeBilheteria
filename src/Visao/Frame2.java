package Visao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Frame2 extends JFrame{
	
	private JTextField textoEscolha;
	private JButton botaoAvancar;
	private JButton botaoVoltar;
	private BorderLayout border_Layout;
	
	public Frame2() {
		super();
		setLayout(null);
		
		textoEscolha = new JTextField("Escolha um filme:", 20);
		textoEscolha.setBounds(420, 0, 120, 20);
		textoEscolha.setEditable(false);
		add(textoEscolha);
		
		botaoAvancar = new JButton("Avançar");
		border_Layout = new BorderLayout();
		setLayout(border_Layout);
		add(botaoAvancar, BorderLayout.SOUTH);
		
		botaoVoltar = new JButton("Voltar");
		add(botaoVoltar, BorderLayout.SOUTH);
		
		
		
		
	}
	
	
	

}
