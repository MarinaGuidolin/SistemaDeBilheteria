package Visao;

import Controle.Database;
import Controle.Filme;
import Controle.Sala;

import java.util.Scanner;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuPrincipal {

    Database database = new Database();
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



        switch (op){


            case 1:

                boolean comprou = false;
                while(comprou == false) {
                    MenuComprarIngresso mingresso = new MenuComprarIngresso(database);//cria um menu para comprar ingresso
                    System.out.println("digite o numero do filme: ");
                    int numeroFilme = s.nextInt();
                    System.out.println("numero do filme "+ numeroFilme);

                    Filme filme = mingresso.selecionarFilme(numeroFilme);
                    System.out.println("numero do filme mingresso "+ filme.getNumero());

                    database.atualizarFilme(filme);
                    System.out.println("numero do filme atualizar "+ filme.getNumero());

                    Filme filmeX = database.retorneFilme(filme);
                    System.out.println("numero do filme retorne filem "+ filme.getNumero());

                    System.out.println("As poltronas disponiveis sao: " + filmeX.poltronasDisponiveis());//mostra as poltronas disponiveis
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
