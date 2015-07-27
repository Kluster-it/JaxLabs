package br.com.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by marcelo on 7/26/15.
 */
@Entity
@Table(name = "tbl_endereco")
public class Endereco {


    @Id
    @GeneratedValue
    private Long id;

    private String tipoLogradouro;

    private String logradouro;

    private String bairro;

    private String cidade;

    private String uf;

    private String cep;
}
