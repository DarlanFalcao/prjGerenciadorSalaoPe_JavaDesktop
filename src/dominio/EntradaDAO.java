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
public class EntradaDAO {
 
    Session session = HibernateUtil.getSession();
    
    public void salvar(Entrada entrada){
        session.beginTransaction();
        session.save(entrada);
        session.getTransaction().commit();
    }
    public void deletar(Entrada entrada){
        session.beginTransaction();
        session.delete(entrada);
        session.getTransaction().commit();
    }
    public void atualizar(Entrada entrada){
        session.beginTransaction();
        session.update(entrada);
        session.getTransaction().commit();
    }
    public List listarEntradas(){
        Query query = session.createQuery("FROM Entrada");
        List<Entrada>listaEntrada = query.list();
        return listaEntrada;
    }
    public List listarEntradasData(String data){
        Query query = session.createQuery("FROM Entrada  WHERE data ="+"'"+data+"'");
        List<Entrada>listaEntrada = query.list();
        return listaEntrada;
    }
    
    public Entrada buscaEntradaNome(String desc){
        Entrada e = new Entrada();
        Query query = session.createQuery("FROM Entrada  WHERE descricao ="+"'"+desc+"'");
        e = (Entrada)query.uniqueResult();
        return e;
        
        
    }
    public List listarEntradasDataDinheiro(String data){
        Query query = session.createQuery("FROM Entrada  WHERE data ="+"'"+data+"' and tipo_pgto = "+"'Dinheiro'");
        List<Entrada>listaEntrada = query.list();
        return listaEntrada;
    }
    public List listarEntradasDataCartao(String data){
        Query query = session.createQuery("FROM Entrada  WHERE data ="+"'"+data+"' and tipo_pgto = "+"'Cartão'");
        List<Entrada>listaEntrada = query.list();
        return listaEntrada;
    }
    
}
