package Controle;

/**
 * Created by marin on 11/8/2017.
 */
public class Filme {
    Sala sala;
    String titulo;
    String horario;
    String tipo;

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
}
