package br.com.petz.clientepet.cliente.application.service;

import java.util.List;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResponseList;

public interface ClienteService {

	ClienteResponse cadastrarCliente(ClienteRequest clienteRequest);

	List<ClienteResponseList> listarTodosClientes();
}
