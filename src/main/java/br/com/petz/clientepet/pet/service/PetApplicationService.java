package br.com.petz.clientepet.pet.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import br.com.petz.clientepet.pet.application.PetRequest;
import br.com.petz.clientepet.pet.application.PetResponse;
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
		log.info("[iniciar] PetApplication - adicionarPet");
		clienteService.buscarClientePorId(idCliente);
		Pet pet  = petRepository.salvarPet(new Pet(idCliente, petRequest));
		log.info("[finalizar] PetApplication - adicionarPet");
		return new PetResponse(pet.getIdPet());
	}	

}
