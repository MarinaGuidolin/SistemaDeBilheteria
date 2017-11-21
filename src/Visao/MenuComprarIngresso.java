package Visao;

import Controle.Database;
import Controle.Filme;
import Controle.Poltrona;

import java.util.ArrayList;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuComprarIngresso {
    Database database;
    public MenuComprarIngresso(Database database ){
        this.database = database;
    }

    public Filme selecionarFilme( int numeroFilme) {

        return database.getFilmes()[numeroFilme - 1];

    }






    }




