package br.com.app.resource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by marcelo on 7/26/15.
 */
public class AnuncianteResource {


    private EntityManager em;

    private Object listAll() {
        return em.createQuery("select a from Anunciante a").getResultList();
    }
}
