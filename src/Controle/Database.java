package Controle;

import java.util.ArrayList;

public class Database {

    ArrayList<Filme> filmes = new ArrayList<Filme>();

    public Database(){
        Sala sala = new Sala(1, 1 );
        Filme filme1 = new Filme(1,"filme1" ,"horario1", sala, "normal", 18, "legendado");
        Filme filme2 = new Filme(2,"filme2" ,"horario2", sala, "normal", 18, "legendado");
        Filme filme3 = new Filme(3,"filme2" ,"horario2", sala, "normal", 18, "legendado");
        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);

    }

    public ArrayList<Filme> getFilmes(){
        return filmes;
    }

    public ArrayList<Filme> adicionarFilme(Filme filme){
       if (filmes.contains(filme) == false)
        filmes.add(filme);
       return filmes;
    }

    public ArrayList<Integer> atualizarFilme(Filme filme){
        int posicao = (filme.getNumero() - 1);
        System.out.println("index do filme atualizado:" + posicao);
        filmes.add(posicao, filme);
        Filme filme2 = filmes.get(posicao);
        return filme2.poltronasDisponiveis();
    }

    public Filme retorneFilme(Filme filme){
        Filme movie;
        if( filmes.contains(filme) == true)
            movie = filme;
        else
            movie = null;
        return movie;
    }


}
