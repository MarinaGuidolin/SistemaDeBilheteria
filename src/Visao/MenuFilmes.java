package Visao;

import Controle.Filme;
import Controle.Sala;

/**
 * Created by marin on 11/16/2017.
 */
public class MenuFilmes {
    //exibir JFrames com os filmes adicionados pelo administrador
    public Filme selecionarFilme(){
        Sala sala1 = new Sala(1, 30);
        Filme filme = new Filme("tituo", "1h20",sala1, "normal", 12, "legendado" );
        return filme;

    }
}
