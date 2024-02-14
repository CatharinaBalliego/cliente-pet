package br.com.petz.clientepet.pet.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.petz.clientepet.pet.domain.Pet;
import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetClienteResponseList {

	private UUID idPet;
	private String nomePet;
	private TipoPet tipo;
	private String pelagem;
	private LocalDate dataNascimento;
	private String raca;
	
	public PetClienteResponseList(Pet pet) {
		super();
		this.nomePet = pet.getIdPet();
		this.nomePet = pet.getNomePet();
		this.tipo = pet.getTipo();
		this.pelagem = pet.getPelagem();
		this.dataNascimento = pet.getDataNascimento();
		this.raca = pet.getRaca();
	}
	
	public static List<PetClienteResponseList>  converter(List<Pet> pets){
		return pets.stream()
				.map(PetClienteResponseList::new).toList();
	}
		
}
