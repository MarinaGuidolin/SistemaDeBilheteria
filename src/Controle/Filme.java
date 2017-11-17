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
    public int[] poltronas = new int[30]; //array de poltronas

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
    public int[] getPoltronas(){
        return poltronas;
    }

    public boolean comprarPoltrona(int numeroPoltrona) {
        int capacidade = poltronas.length;
        boolean comprou = false;
        if (poltronas[numeroPoltrona - 1] == 0 && numeroPoltrona <= capacidade){
            poltronas[numeroPoltrona - 1] = 1;
            comprou = true;
            poltronasDisponiveis();
        }
        return comprou;
    }
    public boolean verificaSalaCheia(){
        boolean cheia = true;
        for(int i: poltronas) {
            if (i == 0) {
                cheia = false;
                break;
            }
        }
        return cheia;
    }

    public ArrayList<Integer> poltronasDisponiveis(){
        ArrayList<Integer> disponiveis = new ArrayList<Integer>();


        for(int i = 0; i < this.getPoltronas().length; i++)
            if(this.getPoltronas()[i] == 0)
                disponiveis.add(i+1);

        return disponiveis;
    }

}


