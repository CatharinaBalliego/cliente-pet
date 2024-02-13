package br.com.petz.clientepet.pet.service;

import java.util.UUID;

import br.com.petz.clientepet.pet.application.PetRequest;
import br.com.petz.clientepet.pet.application.PetResponse;
import jakarta.validation.Valid;

public interface PetService {

	PetResponse adicionarPet(UUID idCliente, @Valid PetRequest petRequest);

}
