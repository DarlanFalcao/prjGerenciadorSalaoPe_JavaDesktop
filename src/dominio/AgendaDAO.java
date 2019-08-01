/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author darlan
 */
public class AgendaDAO {
    Session session = HibernateUtil.getSession();
    
    public void salvar(Agenda agenda){
        session.beginTransaction();
        session.save(agenda);
        session.getTransaction().commit();
    }
    public void atualizar(Agenda agenda){
        session.beginTransaction();
        session.update(agenda);
        session.getTransaction().commit();
    }
    public void deletar(Agenda agenda){
        session.beginTransaction();
        session.delete(agenda);
        session.getTransaction().commit();
    }
    public List<Agenda>listarAgenda(){
        Query query = session.createQuery("FROM * Agenda");
        List<Agenda>lista = query.list();
        return lista;
    }
}
