package br.com.petz.clientepet.pet.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import br.com.petz.clientepet.pet.application.api.PetClienteResponse;
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
	public List<PetClienteResponse> listarTodosPets(UUID idCliente) {
		log.info("[iniciar] PetApplicationService - listarTodosPets");
		clienteService.buscarClientePorId(idCliente);
		//Pet pet  = petRepository.listarPetsCliente(new Pet(idCliente));
		log.info("[finalizar] PetApplicationService - listarTodosPets");
		return null;
	}	

}
