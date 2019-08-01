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
public class ServicoDAO {
  
       Session session = HibernateUtil.getSession();
    
    public void salvar(Servico servico){
        session.beginTransaction();
        session.save(servico);
        session.getTransaction().commit();
    }
    public void deletar(Servico servico){
        session.beginTransaction();
        session.delete(servico);
        session.getTransaction().commit();
    }
    public void atualizar(Servico servico){
        session.beginTransaction();
        session.update(servico);
        session.getTransaction().commit();
    }
    public List listarServicos(){
        Query query = session.createQuery("FROM Servico");
        List<Servico>listaServico = query.list();
        return listaServico;
    }
    public List consultarServicoData(String data){
        Query query = session.createQuery("FROM Servico WHERE data="+"'"+data+"' ORDER BY hora" );
        List<Servico> lista = query.list();
        return lista;
        
    }
    public List consultarServicoDataFunc(String data,int f){
        
        
        Query query = session.createQuery("FROM Servico s  WHERE s.data ="+"'"+data+"'"+"and s.funcionario ="+f+"ORDER BY hora" );
        List<Servico> lista = query.list();
        return lista;
        
    }
    public List consultarServicoPeriodo(String dataInicio, String dataFinal,int id){
        
        Query query = session.createQuery("FROM Servico s  WHERE s.data between "+"'"+dataInicio+"'"+" and '"+dataFinal+"'"+"and s.funcionario ="+id+"");
        List<Servico> lista = query.list();
        return lista;
               
    }
    public List listarServicosTipo(int tipo){
        Query query = session.createQuery("FROM Servico s WHERE s.pago ="+tipo+"ORDER BY s.data");
        List<Servico> lista = query.list();
        return lista;  
    }
    
}
