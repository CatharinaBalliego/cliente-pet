package br.com.petz.clientepet.pet.infra;

import org.springframework.stereotype.Repository;

import br.com.petz.clientepet.pet.domain.Pet;
import br.com.petz.clientepet.pet.service.PetRepository;
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

}
