package br.com.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by marcelo on 7/26/15.
 */

@Entity
public class Visitante {

    @Id
    @GeneratedValue
    private Long id;
}
