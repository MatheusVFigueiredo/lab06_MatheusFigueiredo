package p2CG;

import java.util.ArrayList;

public class Jogo {

	protected String nome;
	protected double preco;
	protected int score;
	protected int jogou;
	protected int concluiu;
	protected Jogabilidade jogabilidade;

	public Jogo(String nome, double preco, int score, int jogou, int concluiu, Jogabilidade jogabilidade)
			throws Exception {

		if (nome == null || nome.trim().equals(""))
			throw new Exception("Nome nao pode ser null ou vazio.");
		if (preco < 0)
			throw new Exception("O preco não pode ser negativo");

		this.nome = nome;
		this.preco = preco;
		this.score = score;
		this.jogou = jogou;
		this.concluiu = concluiu;
		this.jogabilidade = jogabilidade;
	}

	public Jogo() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {

		if (nome == null || nome.trim().equals(""))
			throw new Exception("Nome nao pode ser null ou vazio.");
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws Exception {
		if (preco < 0)
			throw new Exception("O preco não pode ser negativo");
		this.preco = preco;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getJogou() {
		return jogou;
	}

	public void setJogou(int jogou) {
		this.jogou = jogou;
	}

	public int getConcluiu() {
		return concluiu;
	}

	public void setConcluiu(int concluiu) {
		this.concluiu = concluiu;
	}

	public Jogabilidade getJogabilidade() {
		return jogabilidade;
	}

	public void setJogabilidade(Jogabilidade jogabilidade) {
		this.jogabilidade = jogabilidade;
	}

	public int registraJogada(int score, boolean zerou) {

		int x2p = 0;

		if (score > this.score) {

			this.score = score;

			x2p = score / 1000;

		}

		return x2p;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jogo [nome=" + nome + ", preco=" + preco + ", score=" + score + ", jogou=" + jogou + ", concluiu="
				+ concluiu + ", jogabilidade=" + jogabilidade + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + concluiu;
		result = prime * result + jogou;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + score;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogo other = (Jogo) obj;
		if (concluiu != other.concluiu)
			return false;
		if (jogou != other.jogou)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

}
