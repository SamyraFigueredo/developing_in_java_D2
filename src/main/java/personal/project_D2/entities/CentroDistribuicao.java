package personal.project_D2.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "centro_distribuicao")
public class CentroDistribuicao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String endereco;
	private String cidade;
	private String telefone;
	private String email;

	@Column(nullable = false, length = 2)
	private String estado;

	@Column(nullable = false)
	private String cep;

	@Column(name = "capacidade_maxima", nullable = false)
	private int capacidadeMaxima;

	@OneToMany(mappedBy = "centroDistribuicao")
	private List<Doacao> doacoes;

	// Método para adicionar doação com verificação de capacidade
	public void adicionarDoacao(Doacao doacao) {
		if (doacoes.stream().mapToInt(Doacao::getQuantidade).sum() + doacao.getQuantidade() <= 1000) {
			doacoes.add(doacao);
		} else {
			throw new RuntimeException("Limite de capacidade do centro de distribuição atingido");
		}
	}

	public CentroDistribuicao() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}
}
