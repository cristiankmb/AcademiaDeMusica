/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpe.ent.Cursos;

/**
 *
 * @author Cristian
 */
@Stateless
public class CursosFacade extends AbstractFacade<Cursos> {
    @PersistenceContext(unitName = "AcademiaDeSistemasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursosFacade() {
        super(Cursos.class);
    }
    
}
