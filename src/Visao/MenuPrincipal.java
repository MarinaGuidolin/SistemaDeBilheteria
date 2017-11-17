package Visao;

import Controle.Filme;
import Controle.Sala;

import java.util.Scanner;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuPrincipal {
    Scanner s = new Scanner(System.in);
    public void menuInicio() {


        int op = 0;

        while (op != 4) {



            System.out.println("-------------------------------\n"
                    + "1. Comprar ingresso:\n"
                    + "2. Ver Filmes e horários\n"
                    + "3. Entrar como Admnistrador\n"
                    + "4. Sair\n"
                    + "-------------------------------\n"
                    + " Digite a opção: ");

            op = s.nextInt();
            menuSelecao(op);


        }
    }

    public void menuSelecao(int op) {

        MenuComprarIngresso mingresso = new MenuComprarIngresso();//cria um menu para comprar ingresso
        Filme filme = mingresso.selecionarFilme();//primeiro metodo para comprar o ingresso=> selecionar o filme


        switch (op){


            case 1:

                boolean comprou = false;
                while(comprou == false) {
                    System.out.println("As poltronas disponiveis sao: " + mingresso.mostrarPoltronasDisponiveis(filme));//mostra as poltronas disponiveis
                    System.out.println("Digite o numero da poltrona escolhida:");//pede o numero da poltrona a ser comprada
                    int numeroPoltrona = s.nextInt();//pegar input do usuario

                    comprou = filme.comprarPoltrona(numeroPoltrona); //verifica o numero da poltrona
                    if (comprou == true) {
                        System.out.println("Poltrona selecionada com sucesso!");
                    }

                }
                break;

            case 2:

                break;

            case 3:

                break;

            case 4:
                System.out.println("saindo . . .");
                System.exit(1);

            default:
                System.out.println("Opção invalida");


        }


    }


}
