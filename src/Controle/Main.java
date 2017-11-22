package Controle;

import Visao.MenuPrincipal;

import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {

		MenuPrincipal menu = new MenuPrincipal();
		menu.menuInicio();
		/*Database data = new Database();
		MenuComprarIngresso menui = new MenuComprarIngresso(data);
		Filme filme1 = menui.selecionarFilme(1);
		System.out.println(filme1.poltronasDisponiveis());
		Filme filme2 = menui.selecionarFilme(2);
		System.out.println(filme2.poltronasDisponiveis());
		System.out.println("comprando poltrona 1 filme1");
		filme1.comprarPoltrona(1);
		System.out.println(filme1.poltronasDisponiveis());
		filme2.comprarPoltrona(2);
		System.out.println("comprando poltrona 2 filme2");
		System.out.println(filme2.poltronasDisponiveis());
		*/



	}

	public static class Frame2 extends JFrame {

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
}
