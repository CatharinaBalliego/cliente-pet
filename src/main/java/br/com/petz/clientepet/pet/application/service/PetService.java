package br.com.petz.clientepet.pet.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.pet.application.api.PetClienteAlteracaoRequest;
import br.com.petz.clientepet.pet.application.api.PetClienteResponse;
import br.com.petz.clientepet.pet.application.api.PetClienteResponseList;
import br.com.petz.clientepet.pet.application.api.PetRequest;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import jakarta.validation.Valid;

public interface PetService {

	PetResponse adicionarPet(UUID idCliente, @Valid PetRequest petRequest);

	List<PetClienteResponseList> listarTodosPets(UUID idCliente);

	PetClienteResponse buscarPetPorClienteId(UUID idCliente, UUID idPet);

	void deletarPetDoCliente(UUID idCliente, UUID idPet);

	void alterarPetDoCliente(UUID idCliente, UUID idPet, @Valid PetClienteAlteracaoRequest petClienteAlteracaoRequest);

}
