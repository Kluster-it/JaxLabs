package br.com.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by marcelo on 7/26/15.
 */
@Entity
@Table(name = "tbl_anunciante")
public class Anunciante {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String creci;

    private Endereco endereco;

    private Contato contato;

}
