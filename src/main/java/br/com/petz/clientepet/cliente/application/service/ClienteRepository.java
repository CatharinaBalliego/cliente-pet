package br.com.petz.clientepet.cliente.application.service;

import java.util.List;

import br.com.petz.clientepet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salvar(Cliente cliente);
	List<Cliente> listarTodosClientes();
}
