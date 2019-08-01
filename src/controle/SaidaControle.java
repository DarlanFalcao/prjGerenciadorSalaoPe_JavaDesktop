/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dominio.Excecao;
import dominio.Saida;
import dominio.SaidaDAO;
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


public class SaidaControle {
private Saida saida;
private SaidaDAO saidadao;

public void salvarSaida(String data,String descricao,String valor)throws Excecao, ParseException{
    
     if(validarData(data)){
        Excecao ex = new Excecao("Data Inválida!Digite Novamente!");
        throw ex;
    }else if(validarDescricao(descricao)){
        Excecao ex = new Excecao("Descrição Inválida!Digite Novamente!");
        throw ex;
    }else if(validarValor(valor)){
        Excecao ex = new Excecao("Valor Inválido!Digite Novamente!");
        throw ex;
    }else{
        saida = new Saida();
        saidadao = new SaidaDAO();
        valor = valor.replace(",",".");
        saida.setDescricao(descricao);
        saida.setValor(Double.parseDouble(valor));
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = s.parse(data);
        saida.setData(d);
        saidadao.salvar(saida);
        JOptionPane.showMessageDialog(null,"Saída cadastrada com Sucesso!Caixa Livre!");
          
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
public Double retorvaValorSaida(){
    saidadao = new SaidaDAO();
    List<Saida>lista = saidadao.listarSaidas();
    Double valor= 0.0;
    for(Saida lista1:lista){
        valor = valor+=lista1.getValor();
    }
    return valor;
    
}   
public List<Saida>listarSaidas(){
    saidadao = new SaidaDAO();
    List<Saida>lista = saidadao.listarSaidas();
    return lista;
    
}
public List<Saida>listarSaidasData(String data){
    this.saidadao = new SaidaDAO();
    List<Saida> lista = saidadao.listarsaidasData(data);
    return lista;
}
public void alterarSaida(Integer id,String data,String descricao,String valor)throws Excecao, ParseException{
    
     if(validarData(data)){
        Excecao ex = new Excecao("Data Inválida!Digite Novamente!");
        throw ex;
    }else if(validarDescricao(descricao)){
        Excecao ex = new Excecao("Descrição Inválida!Digite Novamente!");
        throw ex;
    }else if(validarValor(valor)){
        Excecao ex = new Excecao("Valor Inválido!Digite Novamente!");
        throw ex;
    }else{
        saida = new Saida();
        saidadao = new SaidaDAO();
        valor = valor.replace(",",".");
        saida.setId(id);
        saida.setDescricao(descricao);
        saida.setValor(Double.parseDouble(valor));
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = s.parse(data);
        saida.setData(d);
        saidadao.atualizar(saida);
        JOptionPane.showMessageDialog(null,"Saída Atualizada com Sucesso!");
          
}
}
public void deletarSaida(Saida saida){
           int resposta = JOptionPane.showConfirmDialog(null, "Tem Certeza que deseja apagar?");
                   if(resposta == JOptionPane.YES_OPTION){
           SaidaDAO dao = new SaidaDAO();
           
           dao.deletar(saida);
           JOptionPane.showMessageDialog(null,"Saída apagada com sucesso!");
           
       }  
    }
public Saida buscaIdSaida(String desc){
        SaidaDAO dao = new SaidaDAO();
        Saida saida = new Saida();
        saida = dao.buscaSaidaNome(desc);
        return saida;
    }


}


