package br.com.petz.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.cliente.domain.Cliente;

public class ClienteResponseList {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String celular;
	private String email;
	
	public static List<ClienteResponseList> converter(List<Cliente> clienteResponseList) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
