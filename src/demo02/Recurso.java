package demo02;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tarefas")
public class Recurso {

	// lista todas as tarefas
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getAll() {
		return Tarefas.INSTANCE.getTarefas().toString();
	}

	// cria nova tarefa
	@POST
	@Path("{descricao}")
	public String add(@PathParam("descricao") String descricao) {
		Tarefa t = new Tarefa(descricao);

		Tarefas.INSTANCE.putTarefa(t);

		return t + " adicionada com sucesso";
	}

	// actualiza estado da tarefa
	@PUT
	@Path("{id}")
	public String add(@PathParam("id") Integer id) {

		Tarefas.INSTANCE.doneTarefa(id);

		return "Tarefa " + id + " actualizada";
	}

}
