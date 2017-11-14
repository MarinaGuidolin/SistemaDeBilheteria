package Controle;

public class IngressoNormal extends Ingresso {
	Filme filme;
	Poltrona poltrona;
	float valor = 26.90f;

	public IngressoNormal(Filme filme, Poltrona poltrona){
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
		return "Normal";
	}
	
	

}
