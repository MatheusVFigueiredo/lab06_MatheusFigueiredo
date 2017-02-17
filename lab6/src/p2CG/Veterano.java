package p2CG;

import java.util.ArrayList;

public class Veterano extends Usuario {

	public Veterano(String nome, String id, double dinheiro, int x2p, ArrayList<Jogo> listaJogos) throws Exception {
		super(nome, id, dinheiro, x2p, listaJogos);

	}

	public static final double DESCONTO = 0.20;

	public void comprarJogo(String tipo, double valor, Jogo jogo) {

		this.x2p += (int) (15*valor);
		valor -= (valor * 0.20);

		this.dinheiro -= valor;
		listaJogos.add(jogo);

	}

}
