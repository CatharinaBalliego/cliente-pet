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


	private String nomePet;
	private Porte porte;
	private TipoPet tipo;
	private String microchip;
	private SexoPet sexoPet;
	private String pelagem;
	private LocalDate dataNascimento;
	private String raca;
	private String rga;
	private double peso;
	
	public PetClienteResponseList(Pet pet) {
		super();
		this.nomePet = pet.getNomePet();
		this.porte = pet.getPorte();
		this.tipo = pet.getTipo();
		this.microchip = pet.getMicrochip();
		this.sexoPet = pet.getSexoPet();
		this.pelagem = pet.getPelagem();
		this.dataNascimento = pet.getDataNascimento();
		this.raca = pet.getRaca();
		this.rga = pet.getRga();
		this.peso = pet.getPeso();
	}
	
	public static List<PetClienteResponseList>  converter(List<Pet> pets){
		return pets.stream()
				.map(PetClienteResponseList::new).toList();
	}
		
}
