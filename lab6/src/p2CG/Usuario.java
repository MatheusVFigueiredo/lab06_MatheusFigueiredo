package p2CG;

import java.util.ArrayList;

public class Usuario {

	protected String nome;
	protected String id;
	protected double dinheiro;
	protected int x2p;
	protected ArrayList<Jogo> listaJogos = new ArrayList<Jogo>();
	protected Jogo jogo = new Jogo();

	public Usuario(String nome, String id, double dinheiro, int x2p, ArrayList<Jogo> listaJogos) throws Exception {

		if (nome == null || nome.trim().equals(""))
			throw new Exception("Nome nao pode ser null ou vazio.");
		if (dinheiro < 0)
			throw new Exception("O dinheiro não pode ser negativo");
		this.nome = nome;
		this.id = id;
		this.dinheiro = dinheiro;
		this.x2p = x2p;
		this.listaJogos = listaJogos;
	}

	public void adicionarDinheiro(double dinheiro) {

		this.dinheiro += dinheiro;
	}

	public void registraJogada(String nomeJogo, int score, boolean zerou) {

		if (nomeJogo.equals("RPG")) {

			this.x2p += 10;

		}

		if (nomeJogo.equals("Plataforma") && zerou == true) {

			this.x2p += 20;

		}

	}

	public String getNome() throws Exception {
		if (nome == null || nome.trim().equals(""))
			throw new Exception("Nome nao pode ser null ou vazio.");
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getDinheiro() throws Exception {
		if (dinheiro < 0)
			throw new Exception("O dinheiro não pode ser negativo");
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getX2p() {
		return x2p;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(dinheiro);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jogo == null) ? 0 : jogo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + x2p;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Double.doubleToLongBits(dinheiro) != Double.doubleToLongBits(other.dinheiro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jogo == null) {
			if (other.jogo != null)
				return false;
		} else if (!jogo.equals(other.jogo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (x2p != other.x2p)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", id=" + id + ", dinheiro=" + dinheiro + ", x2p=" + x2p + ", jogo=" + jogo
				+ "]";
	}
	
	

}
