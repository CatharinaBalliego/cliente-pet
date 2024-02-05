package br.com.petz.clientepet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClienteDetalhadoResponse;
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

	@Override
	public ClienteDetalhadoResponse buscarClientePorId(UUID idCliente) {
		log.info("[inicia] ClienteDetalhadoResponse - buscarClientePorId");
		Cliente cliente = clienteRepository.buscarClientePorId(idCliente);
		log.info("[finaliza] ClienteDetalhadoResponse - buscarClientePorId");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public void deletarClientePorId(UUID idCliente) {
		log.info("[inicia] ClienteDetalhadoResponse - deletarClientePorId");
		Cliente cliente = clienteRepository.buscarClientePorId(idCliente);
		//clienteRepository.deletarCliente(cliente);
		log.info("[finaliza] ClienteDetalhadoResponse - deletarClientePorId");
		
	}

}
