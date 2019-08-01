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
public class ProdutoDAO {

    Session session = HibernateUtil.getSession();
    
    public void salvar(Produto produto){
        session.beginTransaction();
        session.save(produto);
        session.getTransaction().commit();
    }
    public void deletar(Produto produto){
        session.beginTransaction();
        session.delete(produto);
        session.getTransaction().commit();
    }
    public void atualizar(Produto produto){
        session.beginTransaction();
        session.update(produto);
        session.getTransaction().commit();
    }
    public List listarProdutos(){
        Query query = session.createQuery("FROM Produto");
        List<Produto>listaProduto = query.list();
        return listaProduto;
    }
}
