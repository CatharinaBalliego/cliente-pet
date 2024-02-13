package br.com.petz.clientepet.pet.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.pet.application.api.PetClienteResponse;
import br.com.petz.clientepet.pet.application.api.PetRequest;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import jakarta.validation.Valid;

public interface PetService {

	PetResponse adicionarPet(UUID idCliente, @Valid PetRequest petRequest);

	List<PetClienteResponse> listarTodosPets(UUID idCliente);

}
