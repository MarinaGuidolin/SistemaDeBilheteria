package Visao;

import Controle.Database;
import Controle.Filme;
import Controle.Poltrona;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuComprarIngresso {
    Database database;
    public MenuComprarIngresso(Database database ){

        this.database = database;
    }
    public void visualizarFilmes(){
        Frame2 janela = new Frame2();

    }

    public Filme selecionarFilme( int numeroFilme) {

        return database.getFilmes()[numeroFilme - 1];


    }






}




