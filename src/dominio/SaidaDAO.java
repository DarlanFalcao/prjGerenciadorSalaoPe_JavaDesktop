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
public class SaidaDAO {
   Session session = HibernateUtil.getSession();
    
    public void salvar(Saida saida){
        session.beginTransaction();
        session.save(saida);
        session.getTransaction().commit();
    }
    public void deletar(Saida saida){
        session.beginTransaction();
        session.delete(saida);
        session.getTransaction().commit();
    }
    public void atualizar(Saida saida){
        session.beginTransaction();
        session.update(saida);
        session.getTransaction().commit();
    }
    public List listarSaidas(){
        Query query = session.createQuery("FROM Saida");
        List<Produto>listaSaida = query.list();
        return listaSaida;
    }
    public List listarsaidasData(String data){
        Query query = session.createQuery("FROM Saida  WHERE data ="+"'"+data+"'");
        List<Saida>listaSaida = query.list();
        return listaSaida;
    }
    public Saida buscaSaidaNome(String desc){
        Saida e = new Saida();
        Query query = session.createQuery("FROM Saida  WHERE descricao ="+"'"+desc+"'");
        e = (Saida)query.uniqueResult();
        return e;
        
        
    }
    
}
