package br.com.petz.clientepet.pet.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.clientepet.pet.application.service.PetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI {
	private final PetService petService;
	

	@Override
	public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia] PetController - postPet");
		log.info("[idCliente] {}", idCliente);
		PetResponse pet = petService.adicionarPet(idCliente, petRequest);
		log.info("[finaliza] PetController - postPet");
		return pet;
	}


	@Override
	public List<PetClienteResponseList> listarTodosPetsDoCliente(UUID idCliente) {
		log.info("[inicia] PetController - listarTodosPetsDoCliente");
		log.info("[idCliente] {}", idCliente);
		List<PetClienteResponseList> petsDocliente = petService.listarTodosPets(idCliente);
		log.info("[finaliza] PetController - listarTodosPetsDoCliente");
		return petsDocliente;
	}


	@Override
	public PetClienteResponse listarPetDoCliente(UUID idCliente, UUID idPet) {
		log.info("[inicia] PetController - listarPet");
		log.info("[idCliente] {}, [idPet] {}", idCliente, idPet);
		PetClienteResponse pet = petService.buscarPetPorClienteId(idCliente, idPet);
		log.info("[finaliza] PetController - listarPet");
		return pet;
	}


	@Override
	public void deletarPetDoCliente(UUID idCliente, UUID idPet) {
		log.info("[inicia] PetController - deletarPetDoCliente");
		log.info("[idCliente] {}, [idPet] {}", idCliente, idPet);
		petService.deletarPetDoCliente(idCliente, idPet);
		log.info("[finaliza] PetController - deletarPetDoCliente");
		
	}


	@Override
	public PetResponse alterarPetDoCliente(UUID idCliente, UUID idPet,
			@Valid PetClienteAlteracaoRequest petClienteAlteracaoRequest) {
		log.info("[inicia] PetController - deletarPetDoCliente");
		log.info("[idCliente] {}, [idPet] {}", idCliente, idPet);
		return null;
	}

}
