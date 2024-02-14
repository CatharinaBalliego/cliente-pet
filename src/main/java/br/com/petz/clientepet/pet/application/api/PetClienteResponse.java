package br.com.petz.clientepet.pet.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.petz.clientepet.pet.domain.Pet;
import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetClienteResponse {
	private UUID idPet;
	private String nomePet;
	private Porte porte;
	private TipoPet tipo;
	private String microchip;
	private String raca;
	private SexoPet sexoPet;
	private String pelagem;
	private LocalDate dataNascimento;
	private String rga;
	private double peso;
	
	public PetClienteResponse(Pet pet) {
		super();
		this.idPet = pet.getIdPet();
		this.nomePet = pet.getNomePet();
		this.tipo = pet.getTipo();
		this.pelagem = pet.getPelagem();
		this.dataNascimento = pet.getDataNascimento();
		this.raca = pet.getRaca();
		this.porte = pet.getPorte();
		this.sexoPet = pet.getSexoPet();
		this.rga = pet.getRga();
		this.peso = pet.getPeso();
		this.microchip = pet.getMicrochip();
		
	}
}
