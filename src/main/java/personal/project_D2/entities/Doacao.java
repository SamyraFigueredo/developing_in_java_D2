package personal.project_D2.entities;

import java.time.LocalDate;

public class Doacao {

	private int id;
	private String tipo;
	private String descricao;
	private String genero;
	private String tamanho;
	private int quantidade;
	private String unidadeMedida;
	private LocalDate validade;
	private int centroDistribuicaoId;

	public Doacao() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public int getCentroDistribuicaoId() {
		return centroDistribuicaoId;
	}

	public void setCentroDistribuicaoId(int centroDistribuicaoId) {
		this.centroDistribuicaoId = centroDistribuicaoId;
	}
}
