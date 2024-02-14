package br.com.petz.clientepet.pet.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.pet.domain.Pet;

public interface PetRepository {

	 Pet salvarPet(Pet pet);

	List<Pet> listarPetsCliente(UUID idCliente);

	Pet buscarPetPorId(UUID idPet);

}
