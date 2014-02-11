/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Formation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Sara
 */
@Local
public interface FormationFacadeLocal {

    void create(Formation formation);

    void edit(Formation formation);

    void remove(Formation formation);

    Formation find(Object id);

    List<Formation> findAll();

    List<Formation> findRange(int[] range);

    int count();
    
}
