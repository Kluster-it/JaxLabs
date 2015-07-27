package br.com.app.repository;

import br.com.app.entities.Anunciante;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by marcelo on 7/26/15.
 */

@Dependent
public class AnuncianteRepository {

    @PersistenceContext(unitName = "KlusterUnit")
    EntityManager em;

    public List<Anunciante> listAll() {
        return em.createQuery("select a from Anunciante a").getResultList();
    }
}
