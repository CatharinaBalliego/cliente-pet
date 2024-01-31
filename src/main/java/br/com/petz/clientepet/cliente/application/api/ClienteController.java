package br.com.petz.clientepet.cliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {

		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse novoCliente = clienteService.cadastrarCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");

		return novoCliente;
	}

	@Override
	public List<ClienteResponseList> getTodosClientes() {
		log.info("[inicia] ClienteController - getTodosClientes");
		List<ClienteResponseList> clienteResponseList = clienteService.listarTodosClientes();
		log.info("[finaliza] ClienteController - getTodosClientes");
		return clienteResponseList;
	}

}
