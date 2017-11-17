package Visao;

import Controle.Filme;

import java.util.Scanner;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuPrincipal {
    public void menuInicio() {

        int op = 0;

        while (op != 4) {

            Scanner s = new Scanner(System.in);

            System.out.println("-------------------------------\n"
                    + "1. Comprar ingresso:\n"
                    + "2. Ver Filmes e horários\n"
                    + "3. Entrar como Admnistrador\n"
                    + "4. Sair\n"
                    + "-------------------------------\n"
                    + " Digite a opção: ");

            op = s.nextInt();

        }
    }

    public void menuSelecao(int op) {
        switch (op){

            case 1:
                MenuComprarIngresso mingresso = new MenuComprarIngresso();//cria um menu para comprar ingresso
                Filme filme = mingresso.selecionarFilme();//primeiro metodo para comprar o ingresso=> selecionar o filme
                System.out.println("Digite o numero da poltrona escolhida:")
                mingresso.selecionarPoltrona(filme);
                break;

            case 2:
                menuFilmes();
                break;

            case 3:
                menuAdmin();
                break;

            case 4:
                System.out.println("saindo . . .");
                System.exit(1);

            default:
                System.out.println("Opção invalida");


        }


    }


}
