package demo02;

public class Tarefa {

	private String descricao;
	private boolean completa;

	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
		this.completa = false;
	}

	@Override
	public String toString() {
		return "Tarefa descricao=" + descricao + ", completa=" + completa
				+ "<br />";
	}

	public void setCompleta(boolean completa) {
		this.completa = completa;
	}

}
