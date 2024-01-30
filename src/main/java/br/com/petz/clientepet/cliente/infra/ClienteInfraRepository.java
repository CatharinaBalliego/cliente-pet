package br.com.petz.clientepet.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.petz.clientepet.cliente.application.service.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salvar(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salvar");
		log.info("[finaliza] ClienteInfraRepository - salvar");
		return cliente;
	}

}
