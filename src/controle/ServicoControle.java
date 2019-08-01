/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dominio.Excecao;
import dominio.Funcionario;
import dominio.Servico;
import dominio.ServicoDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author darlan
 */
public class ServicoControle {
    
    
    public void salvarServico(String descricao,String valor,String pago,String data,String hora,String tipo,Funcionario funcionario)throws Excecao, ParseException{
        Servico servico = new Servico();
        ServicoDAO servDAO = new ServicoDAO();
        if(validarDescricao(descricao)){
            Excecao ex = new Excecao("Descricao Inválida!Digite Novamente!");
            throw ex;
        }else if(validarValor(valor)){
            Excecao ex = new Excecao("Valor Inválido!Digite Novamente!");
            throw ex;
        }else if(validarData(data)){
        Excecao ex  = new Excecao("Data Inválida!Digite Novamente!");
        throw ex;
    }else if(validarHora(hora)){
        Excecao ex = new Excecao("Hora Inválida!Digite Novamente!");
        throw ex;
    }else{
        servico = new Servico();
        servico.setDescricao(descricao);
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = s.parse(data);
        servico.setData(d);
        valor = valor.replace(",", ".");
        servico.setValor(Double.parseDouble(valor));
        servico.setHora(hora);
        if(pago.equals("SIM")){
            servico.setPago(1);
        }else{
            servico.setPago(0);
        }
        servico.setTipo_pgto(tipo);
        servico.setFuncionario(funcionario);
            servDAO.salvar(servico);
            JOptionPane.showMessageDialog(null,"Servico Agendado com Sucesso!");
    }
        
        
        
        
    }
    public boolean validarData(String data){
   
        return data.length() == 0;
    
}
public boolean validarDescricao(String descricao){
    
    return descricao.length() == 0;
    
}
public boolean validarValor(String valor){
     Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(valor);
        return !matcher.find();
}
public boolean validarHora(String hora){
    return hora.length()==0;
}
public List retornaServicoData(String data){
    ServicoDAO servDAO = new ServicoDAO();
    servDAO = new ServicoDAO();
    List<Servico>lista = servDAO.consultarServicoData(data);
    return lista;
}   
 public void alterarServico(Integer id,String descricao,String valor,String pago,String data,String hora,String tipo,Funcionario funcionario)throws Excecao, ParseException{
        if(validarDescricao(descricao)){
            Excecao ex = new Excecao("Descricao Inválida!Digite Novamente!");
            throw ex;
        }else if(validarValor(valor)){
            Excecao ex = new Excecao("Valor Inválido!Digite Novamente!");
            throw ex;
        }else if(validarData(data)){
        Excecao ex  = new Excecao("Data Inválida!Digite Novamente!");
        throw ex;
    }else if(validarHora(hora)){
        Excecao ex = new Excecao("Hora Inválida!Digite Novamente!");
        throw ex;
    }else{
        
        Servico servico = new Servico();
        ServicoDAO servDAO = new ServicoDAO();
        servico.setDescricao(descricao);
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = s.parse(data);
        servico.setData(d);
        valor = valor.replace(",", ".");
        servico.setValor(Double.parseDouble(valor));
        servico.setHora(hora);
        if(pago.equals("SIM")){
            servico.setPago(1);
        }else{
            servico.setPago(0);
        }
        servico.setId(id);
        servico.setTipo_pgto(tipo);
        servico.setFuncionario(funcionario);
            servDAO.atualizar(servico);
            JOptionPane.showMessageDialog(null,"Agendamento alterado com Sucesso!");
    }
 }
 public void apagarServico(Servico servico){
     ServicoDAO servDAO = new ServicoDAO();
     int resp = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja apagar o agendamento?");
     if(resp == JOptionPane.YES_OPTION){
         servDAO.deletar(servico);
         JOptionPane.showMessageDialog(null,"Agendamento deletado com sucesso!");
     } 
     
     
 }
 public List ConsultaFuncionario(String data,int funcionario){
     ServicoDAO servDAO = new ServicoDAO();
   
     List<Servico>lista = servDAO.consultarServicoDataFunc(data, funcionario);
     return lista;
 }
    
}
