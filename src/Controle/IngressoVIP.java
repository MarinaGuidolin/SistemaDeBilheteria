package Controle;

public class IngressoVIP extends Ingresso {
	
	float valor = 31.9f;
	Filme filme;
	Poltrona poltrona;


	public IngressoVIP(Filme filme, Poltrona poltrona){
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
		return "VIP";
	}
	

}
