package Visao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame2 extends JFrame{

    int numero;
    private JTextField textoEscolha;
    private JButton botaoVoltar;
    private GridLayout grid_Layout;
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
    private int numEscolheFilme;
    private boolean continuar = false;

    ImageIcon imagemFilme1 = new ImageIcon("THOR.jpg");
    public Frame2() {

            super("Selecione um filme");




            botaoFilme1 = new JButton("Filme 1", imagemFilme1);
            botaoFilme2 = new JButton("Filme 2");
            botaoFilme3 = new JButton("Filme 3");
            botaoFilme4 = new JButton("Filme 4");
            botaoFilme5 = new JButton("Filme 5");
            botaoFilme6 = new JButton("Filme 6");
            botaoFilme7 = new JButton("Filme 7");
            botaoFilme8 = new JButton("Filme 8");
            botaoFilme9 = new JButton("Filme 9");
            botaoFilme10 = new JButton("Filme 10");




            grid_Layout = new GridLayout(2,5,5,5);
            setLayout(grid_Layout);
            add(botaoFilme1);
            add(botaoFilme2);
            add(botaoFilme3);
            add(botaoFilme4);
            add(botaoFilme5);
            add(botaoFilme6);
            add(botaoFilme7);
            add(botaoFilme8);
            add(botaoFilme9);
            add(botaoFilme10);

            setExtendedState(JFrame.MAXIMIZED_BOTH);



            botaoFilme1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 1;
                    JOptionPane.showMessageDialog(null,"Voce escolheu o filme " + getNumEscolheFilme());
                }
            });

            botaoFilme2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 2;
                }

            });

            botaoFilme3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 3;
                }

            });

            botaoFilme4.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 4;
                }

            });

            botaoFilme5.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 5;
                }

            });

            botaoFilme6.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 6;
                }

            });

            botaoFilme7.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 7;
                }

            });

            botaoFilme8.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 8;
                }

            });

            botaoFilme9.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 9;
                }

            });

            botaoFilme10.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    numEscolheFilme = 10;
                    int resposta = JOptionPane.showConfirmDialog(null,"Voce escolheu o filme " + numEscolheFilme);
                    if(resposta == JOptionPane.YES_OPTION)
                        getNumEscolheFilme();

                }

            });

        }


public void mostrarJanela(){
    setVisible(true);
}

    public int getNumEscolheFilme(){


        return numEscolheFilme;
    }
}

