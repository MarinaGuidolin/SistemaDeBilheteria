package Controle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marina on 11/8/2017.
 */
public class Filme {
    Sala sala;
    String titulo;
    String horario;
    String tipo;
    public ArrayList<Poltrona> poltronas = new ArrayList<Poltrona>(); //array de poltronas

    public Filme(String titulo, String horario, Sala sala, String tipo){
        this.titulo = titulo;
        this.horario = horario;
        this.sala = sala;
    }

    public String getTitulo(){
        return titulo;
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
        Poltrona poltronaNova = new Poltrona(numeroPoltrona);
        if(poltronas.contains(poltronaNova) == false && poltronas.size() < capacidade)
            adicionou = poltronas.add(poltronaNova);
        return adicionou;
    }
    public boolean verificaSalaCheia(){
        boolean cheia = false;
        if(poltronas.size() == this.getTotalDePoltronas())
            cheia = true;
        return cheia;
    }


}
