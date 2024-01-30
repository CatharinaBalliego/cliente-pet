package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salvar(Cliente cliente);
}
