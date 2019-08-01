/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dominio.Excecao;
import dominio.Funcionario;
import dominio.FuncionarioDAO;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import visao.Cad_Funcionario;

/**
 *
 * @author darlan
 */
public class FuncionarioControle {
    
    
    
    public void cadastrarFuncionario(String nome, String funcao,String matricula)throws Excecao{
      
        if(validarMatricula(matricula)){
            Excecao ex = new Excecao("Matricula Inválida!Digite Novamente!");
            throw ex;
        }else if(validarNome(nome)){
            Excecao ex =  new Excecao("Nome Inválido!Digite Novamente!");
            throw ex;
        }else if(validarFuncao(funcao)){
            Excecao ex = new Excecao("Função Inválida!Digite Novamente!");
            throw ex;
        }else{
        
        Funcionario funcionario = new Funcionario();
        FuncionarioDAO dao = new FuncionarioDAO();
        funcionario.setFuncao(funcao);
        funcionario.setNome(nome);
        funcionario.setMatricula(Integer.valueOf(matricula));
        dao.salvar(funcionario);
        JOptionPane.showMessageDialog(null,"Funcionario cadastrado com sucesso!");
        }
        }
    public boolean validarNome(String nome){
        if(nome.length()==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarFuncao(String funcao){
        if(funcao.length()==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean validarMatricula(String matricula){
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(matricula);
        if(!matcher.find()){
        return true;    
        }else{
            return false;
        }
        
    }
    public void abreCadastroFuncionario(){
        Cad_Funcionario cad = new Cad_Funcionario();
        cad.setVisible(true);
    }
    public List<Funcionario> listarFuncionarios(){
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario>lista = dao.listarFuncionarios();
        return lista;
    }
    public Funcionario buscaFuncionario(int id){
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario f = dao.buscarFuncionario(id); 
        return f;
    }
    public Funcionario buscaIdFuncionario(String nome){
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario funcionario = new Funcionario();
        funcionario = dao.buscaFuncionarioNome(nome);
        return funcionario;
    }
    public void atualizarFuncionario(Integer Id,String matricula,String nome,String funcao) throws Excecao{
       
       if(validarMatricula(matricula)){
            Excecao ex = new Excecao("Matricula Inválida!Digite Novamente!");
            throw ex;
        }else if(validarNome(nome)){
            Excecao ex =  new Excecao("Nome Inválido!Digite Novamente!");
            throw ex;
        }else if(validarFuncao(funcao)){
            Excecao ex = new Excecao("Função Inválida!Digite Novamente!");
            throw ex;
        }else{
        
        Funcionario funcionario = new Funcionario();
        FuncionarioDAO dao = new FuncionarioDAO();
        funcionario.setId(Id);
        funcionario.setFuncao(funcao);
        funcionario.setNome(nome);
        funcionario.setMatricula(Integer.valueOf(matricula));
        dao.atualizar(funcionario);
        JOptionPane.showMessageDialog(null,"Funcionario alterado com sucesso!");
        
        }

    }
    public void deletarFuncionario(Funcionario funcionario){
           int resposta = JOptionPane.showConfirmDialog(null, "Tem Certeza que deseja apagar?");
                   if(resposta == JOptionPane.YES_OPTION){
           FuncionarioDAO dao = new FuncionarioDAO();
           
           dao.deletar(funcionario);
           JOptionPane.showMessageDialog(null,"Funcionário apagado com sucesso!");
           
       }  
    }
}
