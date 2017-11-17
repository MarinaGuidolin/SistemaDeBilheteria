package Visao;

import Controle.Filme;
import Controle.Poltrona;

import java.util.ArrayList;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuPoltronas {
    ArrayList<Integer> poltronasDisponiveis = new ArrayList<Integer>();
    Filme filme;

    public MenuPoltronas(Filme filme){
        this.filme = filme;
    }

    public ArrayList<Integer> mostrarPoltronasDisponiveis() {
        return filme.poltronasDisponiveis();

    }
}
