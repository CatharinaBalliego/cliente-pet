package br.com.petz.clientepet.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.petz.clientepet.cliente.application.service.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import br.com.petz.clientepet.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salvar(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salvar");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salvar");
		return cliente;
	}

	@Override
	public List<Cliente> listarTodosClientes() {

		log.info("[inicia] ClinteInfraRepository - listarTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClinteInfraRepository - listarTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscarClientePorId(UUID idCliente) {
		log.info("[inicia] ClienteInfraRepository - buscarClientePorId");
		Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrado!"));
		log.info("[finaliza] ClienteInfraRepository - buscarClientePorId");
		return cliente;
	}

}
