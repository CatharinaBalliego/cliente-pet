package br.com.petz.clientepet.pet.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import br.com.petz.clientepet.pet.application.api.PetClienteResponse;
import br.com.petz.clientepet.pet.application.api.PetClienteResponseList;
import br.com.petz.clientepet.pet.application.api.PetRequest;
import br.com.petz.clientepet.pet.application.api.PetResponse;
import br.com.petz.clientepet.pet.domain.Pet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PetApplicationService implements PetService {
	private final ClienteService clienteService;
	private final PetRepository petRepository;
	
	@Override
	public PetResponse adicionarPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[iniciar] PetApplicationService - adicionarPet");
		clienteService.buscarClientePorId(idCliente);
		Pet pet  = petRepository.salvarPet(new Pet(idCliente, petRequest));
		log.info("[finalizar] PetApplicationService - adicionarPet");
		return new PetResponse(pet.getIdPet());
	}

	@Override
	public List<PetClienteResponseList> listarTodosPets(UUID idCliente) {
		log.info("[iniciar] PetApplicationService - listarTodosPets");
		clienteService.buscarClientePorId(idCliente);
		List<Pet> pets  = petRepository.listarPetsCliente(idCliente);
		log.info("[finalizar] PetApplicationService - listarTodosPets");
		return PetClienteResponseList.converter(pets);
	}

	@Override
	public PetClienteResponse buscarPetPorClienteId(UUID idCliente, UUID idPet) {
		log.info("[iniciar] PetApplicationService - buscarPetPorClienteId");
		clienteService.buscarClientePorId(idCliente);
		Pet pet = petRepository.buscarPetPorId(idPet);
		log.info("[finalizar] PetApplicationService - buscarPetPorClienteId");
		return new PetClienteResponse(pet);
	}	

}
