package Controle;

import java.util.ArrayList;

public class Database {

    Filme[] filmes = new Filme[3];

    public Database() {
        Sala sala3D = new Sala( 1);
        Sala salaNormal = new Sala(2);
        Sala salaNormal2 = new Sala(3);
        Sala salaVip = new Sala(4);

        Filme filme1 = new Filme(1, "Star Wars: The Last Jedi", "00h00", sala3D, "3D", 16, "Legendado");
        Filme filme2 = new Filme(2, "Star Wars: The Last Jedi", "16h20", salaNormal, "Normal", 16, "Dublado");
        Filme filme3 = new Filme(3, "League Of Justice", "15h10", salaNormal, "Normal", 16, "Legendado");
        Filme filme4 = new Filme(4, "League Of Justice", "21h10", salaVip, "VIP", 16, "Legendado");
        Filme filme5 = new Filme(5, "Minha Mae E Uma Peca", "14h10", salaNormal, "Normal", 00, "Nacional");
        Filme filme6 = new Filme(6, "Thor: Ragnarok", "22h00", salaVip, "VIP", 12, "Legendado");
        Filme filme7 = new Filme(7, "Thor: Ragnarok", "15h10", salaNormal2, "Normal", 12, "Legendado");
        Filme filme8 = new Filme(8, "Titanic", "22h00", salaVip, "VIP", 16, "Legendado");
        Filme filme9 = new Filme(9, "Get Out", "17h20", salaNormal, "Normal", 18, "Legendado");
        Filme filme10 = new Filme(10, "50 Tons De Cinza", "20h00", salaVip, "VIP", 18, "Legendado");

        filmes[0] = filme1;
        filmes[1] = filme2;
        filmes[2] = filme3;
        filmes[3] = filme4;
        filmes[4] = filme5;
        filmes[5] = filme6;
        filmes[6] = filme7;
        filmes[7] = filme8;
        filmes[8] = filme9;
        filmes[9] = filme10;

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
