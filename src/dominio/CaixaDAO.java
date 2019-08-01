/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import org.hibernate.Session;

/**
 *
 * @author darlan
 */
public class CaixaDAO {
   Session session = HibernateUtil.getSession();
    
    public void salvar(Caixa caixa){
        session.beginTransaction();
        session.save(caixa);
        session.getTransaction().commit();
    }
    public void alterar(Caixa caixa){
        session.beginTransaction();
        session.update(caixa);
        session.getTransaction().commit();
    }
    public void deletar(Caixa caixa){
        session.beginTransaction();
        session.delete(caixa);
        session.getTransaction().commit();
    }
    
}
