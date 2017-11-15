package Controle;

public class Ingresso3D extends Ingresso{

    float valor = 36.9f;
    Filme filme;
    Poltrona poltrona;


    public Ingresso3D(Filme filme, Poltrona poltrona){
        this.filme = filme;
        this.poltrona = poltrona;
    }
    @Override
    public float getValor() {
        return valor;
    }
    @Override
    public int getPoltrona() {
        return poltrona.getNumero();
    }
    @Override
    public String getTipo(){
        return "3D";
    }


}
