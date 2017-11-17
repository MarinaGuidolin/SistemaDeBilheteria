package Controle;

import Visao.TelaInicial;

public class Main {

	public static void main(String[] args) {
		Sala sala1 = new Sala(50,2);
		Filme filme = new Filme("Filme1", "5h10min", sala1, "3D", 18, "legendado");
		System.out.println(filme.getTotalDePoltronas());
		System.out.println(filme.getSala().getNumeroDaSala());
		System.out.println(filme.getTipo());
		System.out.println(filme.getTitulo());
	}
}
