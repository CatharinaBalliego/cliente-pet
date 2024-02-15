package br.com.petz.clientepet.pet.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz.clientepet.pet.application.api.PetClienteAlteracaoRequest;
import br.com.petz.clientepet.pet.application.api.PetRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

	@NotNull
	@Column(columnDefinition = "uuid", name = "idClienteTutor", nullable = false)
	private UUID idClienteTutor;
	
	@NotBlank
	private String nomePet;
	
	@Enumerated(EnumType.STRING)
	private Porte porte;
	
	@Enumerated(EnumType.STRING)
	private TipoPet tipo;
	
	private String microchip;

	@Enumerated(EnumType.STRING)
	private SexoPet sexoPet;
	
	private String pelagem;
	
	@NotNull
	private LocalDate dataNascimento;
	
	private String raca;
	
	private String rga;
	
	private double peso;
	
	private LocalDateTime dataHoracadastro;
	private LocalDateTime dataHoraAlteracao;
	
	
	public Pet(UUID idCliente, @Valid PetRequest petRequest) {
		this.idClienteTutor = idCliente;
		this.nomePet = petRequest.getNomePet();
		this.porte = petRequest.getPorte();
		this.tipo = petRequest.getTipo();
		this.microchip = petRequest.getMicrochip();
		this.sexoPet = petRequest.getSexoPet();
		this.pelagem = petRequest.getPelagem();
		this.dataNascimento = petRequest.getDataNascimento();
		this.raca = petRequest.getRaca();
		this.rga = petRequest.getRga();
		this.peso = petRequest.getPeso();
		this.dataHoracadastro = LocalDateTime.now();
	}


	public void alterar(PetClienteAlteracaoRequest petClienteAlteracaoRequest) {
		this.nomePet = petClienteAlteracaoRequest.getNomePet();
		this.porte = petClienteAlteracaoRequest.getPorte();
		this.tipo = petClienteAlteracaoRequest.getTipo();
		this.microchip = petClienteAlteracaoRequest.getMicrochip();
		this.sexoPet = petClienteAlteracaoRequest.getSexoPet();
		this.pelagem = petClienteAlteracaoRequest.getPelagem();
		this.dataNascimento = petClienteAlteracaoRequest.getDataNascimento();
		this.raca = petClienteAlteracaoRequest.getRaca();
		this.rga = petClienteAlteracaoRequest.getRga();
		this.peso = petClienteAlteracaoRequest.getPeso();
		this.dataHoraAlteracao = LocalDateTime.now();
		
	}

}
