package br.com.petz.clientepet.cliente.application.api;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import br.com.petz.clientepet.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	private String nomeCompleto;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@NotNull
	private Boolean aceitaTermos;
	
}
