package br.com.green.core.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Table(name = "green_user")
@Entity
@Getter
@Setter
public class GreenUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(min = 1, max = 20)
	private String login;

	@NotEmpty
	@Size(min = 1, max = 20)
	private String password;

}
