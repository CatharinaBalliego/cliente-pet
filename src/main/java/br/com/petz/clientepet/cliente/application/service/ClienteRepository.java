package br.com.petz.clientepet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salvar(Cliente cliente);
	List<Cliente> listarTodosClientes();
	Cliente buscarClientePorId(UUID idCliente);
}
