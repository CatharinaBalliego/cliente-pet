package br.com.petz.clientepet.cliente.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import br.com.petz.clientepet.cliente.application.api.ClienteResponseList;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;
	
	@Override
	public ClienteResponse cadastrarCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - cadastrarCliente");
		Cliente cliente = clienteRepository.salvar(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - cadastrarCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}

	@Override
	public List<ClienteResponseList> listarTodosClientes() {
		log.info("[inicia] ClienteApplicationService - listarTodosClientes");
		List<Cliente> clienteResponseList = clienteRepository.listarTodosClientes();
		log.info("[finaliza] ClienteApplicationService - listarTodosClientes");

		return ClienteResponseList.converter(clienteResponseList);
	}

}
