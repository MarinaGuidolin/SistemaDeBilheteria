package Controle;

import java.util.ArrayList;

/**
 * Created by marina on 11/8/2017.
 */
public class Sala {

    int numeroPoltronas;
    int numeroSala;
    public Sala(int numeroPoltronas, int numeroSala){
        this.numeroPoltronas = numeroPoltronas;
        this.numeroSala = numeroSala;
    }

    public int getNumeroDePoltronas() {
        return numeroPoltronas;
    }

    public int getNumeroDaSala(){
        return numeroSala;
    }
}
