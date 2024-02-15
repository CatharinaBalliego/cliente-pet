package br.com.petz.clientepet.pet.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.petz.clientepet.pet.domain.Pet;
import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetClienteAlteracaoRequest {
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
	
}
