package Controle;

import java.util.ArrayList;

public class Database {

    Filme[] filmes = new Filme[3];

    public Database() {
        Sala sala = new Sala(1, 1);
        Filme filme1 = new Filme(1, "filme1", "horario1", sala, "normal", 18, "legendado");
        Filme filme2 = new Filme(2, "filme2", "horario2", sala, "normal", 18, "legendado");
        Filme filme3 = new Filme(3, "filme2", "horario2", sala, "normal", 18, "legendado");
        filmes[0] = filme1;
        filmes[1] = filme2;
        filmes[2] = filme3;
    }

    public Filme[] getFilmes(){
        return filmes;
    }

   /* public ArrayList<Filme> adicionarFilme(Filme filme){
       if (filmes.contains(filme) == false)
        filmes.add(filme);
       return filmes;
    }*/

    public ArrayList<Integer> atualizarFilme(Filme filme){
        int posicao = (filme.getNumero() - 1);
        System.out.println("index do filme atualizado:" + posicao);
        filmes[posicao] = filme;
        return filme.poltronasDisponiveis();
    }

    public Filme retorneFilme(Filme filme){
        Filme movie = null;
        for(int i = 0; i < filmes.length; i++) {
            if (filme.numeroDoFilme == filmes[i].numeroDoFilme)
                movie = filme;
        }
        return movie;
    }

   /* public Filme retorneFilme(Filme filme){
        Filme movie;
        if( filmes.contains(filme) == true)
            movie = filme;
        else
            movie = null;
        return movie;
    }*/


}
