package demo02;

import java.util.Collection;
import java.util.HashMap;

//singleton

public enum Tarefas {
	INSTANCE;

	private HashMap<Integer, Tarefa> tarefas = new HashMap<Integer, Tarefa>();

	private Tarefas() {
		tarefas.put(1, new Tarefa("Tarefa 1"));
		tarefas.put(2, new Tarefa("Tarefa 2"));
		tarefas.put(3, new Tarefa("Tarefa 3"));
	}

	public Collection<Tarefa> getTarefas() {
		return tarefas.values();
	}

	public void putTarefa(Tarefa t) {
		tarefas.put(tarefas.size() + 1, t);
	}

	public void doneTarefa(Integer id) {
		tarefas.get(id).setCompleta(true);
	}

}
