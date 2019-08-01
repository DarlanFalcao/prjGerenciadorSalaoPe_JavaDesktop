/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dominio.Cliente;
import dominio.ClienteDAO;
import dominio.Excecao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darlan
 */
public class ClienteControle {
    public void salvarCliente(String nome,String cpf,String rua,String cidade,String bairro,int numero,String telefone){
    
        ClienteDAO cdao = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setBairro(bairro);
        try {
            cliente.setCidade(cidade);
        } catch (Excecao ex) {
             String message = ex.getMessage();
       }
        cliente.setCpf(cpf);
        cliente.setNome(nome);
        cliente.setNumero(numero);
        try {
            cliente.setRua(rua);
        } catch (Excecao ex) {
             String message = ex.getMessage();
       }
        cliente.setTelefone(telefone);
        cdao.salvar(cliente);
    }
    
    
    
}
