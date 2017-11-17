package Controle;

import java.util.ArrayList;

/**
 * Created by marina on 11/8/2017.
 */
public class Filme {
    int classificacao;
    Sala sala;
    String titulo;
    String legendado;
    String horario;
    String tipo;

    public ArrayList<Integer> poltronas = new ArrayList<Integer>(); //array de poltronas

    public Filme(String titulo, String horario, Sala sala, String tipo, int classificacao, String legendado){
        this.classificacao = classificacao;
        this.titulo = titulo;
        this.horario = horario;
        this.sala = sala;
        this.legendado = legendado;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getLegenda(){
        return legendado;
    }
    public int getClassificacao(){
        return classificacao;
    }
    public String getHorario(){
        return horario;
    }
    public Sala getSala(){
        return sala;
    }

    public String getTipo(){
        return tipo;
    }

    public int getTotalDePoltronas(){
        return sala.getNumeroDePoltronas();
    }
    public boolean adicionarPoltrona(int numeroPoltrona){
        int capacidade = this.getTotalDePoltronas();
        boolean adicionou = false;
        if(poltronas.contains(numeroPoltrona) == false && poltronas.size() < capacidade)
            adicionou = poltronas.add(numeroPoltrona);
        return adicionou;
    }
    public boolean verificaSalaCheia(){
        boolean cheia = false;
        if(poltronas.size() == this.getTotalDePoltronas())
            cheia = true;
        return cheia;
    }

    public ArrayList<Integer> showPoltronasDisponiveis(){

    }


}
