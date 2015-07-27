package br.com.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by marcelo on 7/27/15.
 */
@Entity
@Table(name = "tbl_contato")
public class Contato {

    @Id
    @GeneratedValue
    private Long id;

    private String tipoContato;

    private String contato;


}
