package br.com.petz.clientepet.pet.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPet", updatable = false, unique = true, nullable = false)
	private UUID idPet;
	
	@NotBlank
	private String nomePet;
	
	@Enumerated(EnumType.STRING)
	private Porte porte;
	
	@Enumerated(EnumType.STRING)
	private TipoPet tipo;
	
	private String microchip;

	@Enumerated(EnumType.STRING)
	private SexoPet sexo;
	
	private String pelagem;
	
	@NotBlank
	private LocalDateTime dataNascimento;
	
	private String raca;
	
	private String RGA;
	
	private double peso;
	
	private LocalDateTime dataHoracadastro;
	private LocalDateTime dataHoraAlteracao;
	
	

}
