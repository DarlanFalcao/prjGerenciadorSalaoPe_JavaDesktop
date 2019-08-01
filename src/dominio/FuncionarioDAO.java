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
public class FuncionarioDAO {

    Session session = HibernateUtil.getSession();
    
    public void salvar(Funcionario funcionario){
        session.beginTransaction();
        session.save(funcionario);
        session.getTransaction().commit();
    }
    public void deletar(Funcionario funcionario){
        session.beginTransaction();
        session.delete(funcionario);
        session.getTransaction().commit();
    }
    public void atualizar(Funcionario funcionario){
        session.beginTransaction();
        session.update(funcionario);
        session.getTransaction().commit();
    }
    public List listarFuncionarios(){
        Query query  = session.createQuery("FROM Funcionario f ORDER BY f.nome");
        List<Funcionario>listaFuncionario = query.list();
        return listaFuncionario;
    }
    public Funcionario buscarFuncionario(int id){
        Funcionario f = new Funcionario();
        Query query = session.createQuery("FROM Funcionario f WHERE f.id ="+id);
        f = (Funcionario) query.uniqueResult();
        return f;
    }
    public Funcionario buscaFuncionarioNome(String nome){
        Funcionario f = new Funcionario();
        Query query = session.createQuery("FROM Funcionario  WHERE nome ="+"'"+nome+"'");
        f = (Funcionario)query.uniqueResult();
        return f;
        
        
    }
}
