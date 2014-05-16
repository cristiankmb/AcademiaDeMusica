/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpe.ent.Estudiantes;

/**
 *
 * @author Cristian
 */
@Stateless
public class EstudiantesFacade extends AbstractFacade<Estudiantes> {
    @PersistenceContext(unitName = "AcademiaDeSistemasPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudiantesFacade() {
        super(Estudiantes.class);
    }
    
}
