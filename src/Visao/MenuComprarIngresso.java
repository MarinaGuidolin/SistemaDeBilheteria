package Visao;

import Controle.Filme;
import Controle.Poltrona;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuComprarIngresso {

    public Filme selecionarFilme(){
        MenuFilmes mfilmes = new MenuFilmes();
        return mfilmes.selecionarFilme();
    }

    public Poltrona selecionarPoltrona(Filme filme) {


    }
}
