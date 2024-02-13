package br.com.petz.clientepet.pet.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PetRequest {
	@NotBlank
	private String nomePet;
	private Porte porte;
	@NotNull
	private TipoPet tipo;
	private String microchip;
	@NotNull
	private SexoPet sexoPet;
	private String pelagem;
	@NotNull
	private LocalDate dataNascimento;
	@NotBlank
	private String raca;
	private String rga;
	private double peso;
}
