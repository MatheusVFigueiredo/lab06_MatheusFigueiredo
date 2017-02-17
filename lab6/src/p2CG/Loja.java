package p2CG;

import java.util.ArrayList;

public class Loja {

	ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public void vendaJogos(Usuario usuario, Jogo jogo) throws Exception {
		if (usuario.dinheiro < jogo.preco)
			throw new Exception("Dinheiro insuficiente");

		usuario.listaJogos.add(jogo);
		usuario.dinheiro -= jogo.preco;

	}

	public void adicionarUsuarios(Usuario usuario) {

		usuarios.add(usuario);
	}

	public void adicionarDinheiro(String id, double dinheiro) {

		for (Usuario usuario : usuarios) {

			if (usuario.getId().equals(id)) {

				usuario.dinheiro += dinheiro;

			}

		}

	}

	public void imprimirInformacoes() throws Exception {

		System.out.println("=== Central P2-CG ===");

		for (Usuario usuario : usuarios) {

			System.out.println(usuario.getId());
			System.out.println(usuario.getNome());
			System.out.println("Lista de Jogos:");
			for (Jogo jogo : usuario.listaJogos) {

				System.out.println(jogo);

			}

		}
	}

}
