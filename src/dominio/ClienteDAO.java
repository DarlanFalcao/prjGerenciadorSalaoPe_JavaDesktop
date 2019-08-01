/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author darlan
 */
public class ClienteDAO {
    Session session = HibernateUtil.getSession();
    public void salvar(Cliente cliente){
        session.beginTransaction();
        session.save(cliente);
        session.getTransaction().commit();
    }
    public void deletar(Cliente cliente){
        session.beginTransaction();
        session.delete(cliente);
        session.getTransaction().commit();
    }
    public void atualizar(Cliente cliente){
        session.beginTransaction();
        session.update(cliente);
        session.getTransaction().commit();
    }
    public List listarClientes(){
        org.hibernate.Query query = session.createQuery("FROM Cliente");
        List<Cliente>listaCliente = query.list();
        return listaCliente;
    }
    
}
