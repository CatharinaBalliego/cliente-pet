package br.com.petz.clientepet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.cliente.application.api.ClienteAlteracaoRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResponseList;
import jakarta.validation.Valid;

public interface ClienteService {

	ClienteResponse cadastrarCliente(ClienteRequest clienteRequest);

	List<ClienteResponseList> listarTodosClientes();

	ClienteDetalhadoResponse buscarClientePorId(UUID idCliente);

	void deletarClientePorId(UUID idCliente);

	void patchAlterarCliente(UUID idCliente,  ClienteAlteracaoRequest clienteAlteracaoRequest);

}
