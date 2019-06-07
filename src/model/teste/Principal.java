package model.teste;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import model.Atendente;
import model.Atendimento;
import model.Categoria;
import model.Cliente;
import model.Equipamento;
import model.GrupoOperador;
import model.Item;
import model.LogAtendimento;
import model.PesquisaSatisfacao;
import model.SubCategoria;
import model.Tecnico;
import model.enums.NivelSatisfacao;
import model.enums.NivelUrgencia;
import model.enums.Ocorrencia;
import model.enums.StatusOcorrencia;
import model.enums.TipoResolucao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tecnico tecnico = new Tecnico("David de Almeida", "10569114624", "201564956");
		GrupoOperador gOperador = new GrupoOperador("Limpeza e Manutencao", 60.0, true);
		System.out.println(" ============= Adicionando técnico ============= ");
		System.out.println(tecnico.toString());
		
		gOperador.adicioanrTecnico(tecnico);
		
		// Criando cliente
		Categoria categoria = new Categoria("Hardware", 
						   			new SubCategoria("Periférico",  
						   					new Item("Teclado")));
		Cliente cliente = new Cliente("Ronaldo de Araujo", "3654854475", "ronaldo.araujo@json.com", UUID.randomUUID().toString());
		System.out.println(" ============= Cadastrando cliente ============= ");
		System.out.println(cliente.toString());
		
		
		// Criando atendente
		
		Atendente atendente = new Atendente("Maria das Dores", "123.456.999-88", UUID.randomUUID().toString());
		System.out.println("\n\n\n====== Cadastro de Atendente ====== ");
		System.out.println(atendente.toString());
		
		Atendimento atendimento = new Atendimento(cliente, atendente);
		atendimento.adicionarInteracao(new LogAtendimento(LocalDateTime.now(), atendente, "Primeiro registro de atendimento"));
		atendimento.setDataAlvo(LocalDateTime.now().plusDays(2));
		atendimento.atualizarStatus(StatusOcorrencia.EM_ATENDIMENTO,
									new LogAtendimento(LocalDateTime.now(), 
													   atendente,
													   "Solicitação de limpeza de notebook. Técnico solicitado."));
		
		Ocorrencia ocorrencia = new Ocorrencia("Cliente deseja realizar limpeza do notebook.", 
									  		  NivelUrgencia.MEDIO, 
									  		  1,
									  		  categoria, 
									  		  tecnico, 
									  		  gOperador);
		
		
		atendimento.setOcorrencia(ocorrencia);
		List<Equipamento> equipamentosUtilizar = new ArrayList<Equipamento>();
		equipamentosUtilizar.add(new Equipamento("Pincél"));
		equipamentosUtilizar.add(new Equipamento("Pasta térmica"));
		equipamentosUtilizar.add(new Equipamento("Parafusadeira"));
		atendimento.utilizarEquipamento(equipamentosUtilizar);
		atendimento.adicionarInteracao(new LogAtendimento(LocalDateTime.now(),
													   tecnico, 
													   "Limpeza realizada com sucesso!"));
		
		atendimento.atualizarStatus(StatusOcorrencia.RESOLVIDO, 
									new LogAtendimento(LocalDateTime.now(),
													   atendente, 
													   "Técnico realizou a limpeza do equipamento."));
		
		atendimento.setTipoResolucao(TipoResolucao.SOLICITACAO);
		
		PesquisaSatisfacao pesquisa = new PesquisaSatisfacao();
		pesquisa.setComentarios("Tecnico atencioso e fez o trabalho conforme planejado.");
		pesquisa.setNivelSatisfacao(NivelSatisfacao.MUITO_BOM);
		atendimento.finalizarAtendimento(pesquisa);
		
		System.out.println(" ============= Exibindo log de atendimento ============= ");
		atendimento.visualizarLog();
		
		
	}

}
