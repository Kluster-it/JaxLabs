package br.com.app.entities;

import br.com.app.enums.TipoImovel;
import br.com.app.enums.TipoNegocio;

import javax.persistence.*;

/**
 * Created by marcelo on 7/26/15.
 */

@Entity
@Table(name = "tbl_imovel")
public class Imovel {

    @Id
    @GeneratedValue
    private Long id;

    private TipoImovel tipoImovel;

    private TipoNegocio tipoNegocio;

    private String codigoImovel;

    @OneToOne
    private Endereco endereco;

    @ManyToOne
    private Anunciante anunciante;

    private double valorImovel;

    private double areaTotal;

    private double areaUtil;

    private String textoAnuncio;




}
