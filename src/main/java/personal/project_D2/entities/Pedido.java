package personal.project_D2.entities;

import java.util.List;

public class Pedido {

	private int id;
	private int abrigoId;
	private List<ItemPedido> itens;

	public Pedido() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAbrigoId() {
		return abrigoId;
	}

	public void setAbrigoId(int abrigoId) {
		this.abrigoId = abrigoId;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

}
