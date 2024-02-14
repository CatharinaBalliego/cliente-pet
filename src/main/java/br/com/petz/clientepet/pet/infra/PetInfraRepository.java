package br.com.petz.clientepet.pet.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.petz.clientepet.cliente.application.service.ClienteRepository;
import br.com.petz.clientepet.pet.application.service.PetRepository;
import br.com.petz.clientepet.pet.domain.Pet;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
	private final PetSpringDataJPARepository petSpringDataJPARepository;
	
	@Override
	public Pet salvarPet(Pet pet) {
		log.info("[iniciar] PetInfraRepository - salvarPet");
		petSpringDataJPARepository.save(pet);
		log.info("[finalizar] PetInfraRepository - salvarPet");
		return pet;
	}
	
	@Override
	public List<Pet> listarPetsCliente(UUID idCliente) {
		log.info("[iniciar] PetInfraRepository - listarPetsCliente");
		var pets = petSpringDataJPARepository.findByIdClienteTutor(idCliente);
		log.info("[finalizar] PetInfraRepository - listarPetsCliente");
		return pets;
	}

}
