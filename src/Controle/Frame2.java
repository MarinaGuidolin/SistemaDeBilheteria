package Controle;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Frame2 extends JFrame{

    private JTextField textoEscolha;
    private JButton botaoVoltar;
    private BorderLayout border_Layout;
    private JButton botaoFilme8;
    private JButton botaoFilme1;
    private JButton botaoFilme2;
    private JButton botaoFilme3;
    private JButton botaoFilme4;
    private JButton botaoFilme5;
    private JButton botaoFilme6;
    private JButton botaoFilme7;
    private JButton botaoFilme9;
    private JButton botaoFilme10;
    public Frame2() {
        super();
        setLayout(null);

        textoEscolha = new JTextField("Escolha um filme:", 20);

        textoEscolha.setBounds(420, 0, 120, 20);
        textoEscolha.setEditable(false);
        add(textoEscolha);


        border_Layout = new BorderLayout();
        setLayout(border_Layout);
        add(botaoFilme1, BorderLayout.NORTH);
        add(botaoFilme2, BorderLayout.NORTH);
        add(botaoFilme3, BorderLayout.NORTH);
        add(botaoFilme4, BorderLayout.NORTH);
        add(botaoFilme5, BorderLayout.NORTH);
        add(botaoFilme6, BorderLayout.SOUTH);
        add(botaoFilme7, BorderLayout.SOUTH);
        add(botaoFilme8, BorderLayout.SOUTH);
        add(botaoFilme9, BorderLayout.SOUTH);
        add(botaoFilme10, BorderLayout.SOUTH);



        }






}

