package p2CG;

import java.util.ArrayList;

public class Noob extends Usuario {

	public Noob(String nome, String id, double dinheiro, int x2p, ArrayList<Jogo> listaJogos) throws Exception {
		super(nome, id, dinheiro, x2p, listaJogos);

	}

	public static final double DESCONTO = 0.10;

	public void comprarJogo(String tipo, double valor, Jogo jogo) {

		this.x2p += (int) (10 * valor);
		valor -= (valor * 0.10);

		this.dinheiro -= valor;
		listaJogos.add(jogo);

	}
}
