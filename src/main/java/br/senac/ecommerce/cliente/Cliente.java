package br.senac.ecommerce.cliente;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Builder
@Entity(name="Cliente")
public class Cliente {

}
