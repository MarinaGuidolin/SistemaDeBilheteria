package Visao;

import Controle.Filme;
import Controle.Poltrona;

import java.util.ArrayList;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuComprarIngresso {

    public Filme selecionarFilme() {
        MenuFilmes mfilmes = new MenuFilmes();
        return mfilmes.selecionarFilme();
    }
    public ArrayList<Integer> mostrarPoltronasDisponiveis(Filme filme) {
        MenuPoltronas mpoltronas = new MenuPoltronas(filme);
        return mpoltronas.mostrarPoltronasDisponiveis();


    }

    public boolean verificarDisponibilidadePoltrona(int numeroPoltrona, Filme filme){
        boolean numero = false;
        if(mostrarPoltronasDisponiveis(filme).contains(numeroPoltrona) == true)
            numero = true;
        return numero;

    }



    }




