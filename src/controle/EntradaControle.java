/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dominio.Entrada;
import dominio.EntradaDAO;
import dominio.Excecao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import visao.Cad_Caixa;
import visao.Principal;

/**
 *
 * @author darlan
 */
        
public class EntradaControle {

private Entrada entrada;
private EntradaDAO dao;
private Principal p;
    
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
public void salvarEntrada(String descricao, String data, String valor,int pgto,String tipoPgto)throws Excecao, ParseException, Exception{

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
        entrada = new Entrada();
        dao = new EntradaDAO();
        valor = valor.replace(",",".");
        entrada.setDescricao(descricao);
        entrada.setPgto(pgto);
        entrada.setTipo_pgto(tipoPgto);
        entrada.setValor(Double.parseDouble(valor));
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = s.parse(data);
        entrada.setData(d);
        dao.salvar(entrada);
        JOptionPane.showMessageDialog(null,"Entrada cadastrada com Sucesso!Caixa Livre!");
        
    }  
} 
public void salvarCaixa(String data,String valor) throws ParseException,Excecao, Exception{
        if(validarData(data)){
            Excecao ex = new Excecao("Data Inválida!Digite novamente!");
            throw ex;
        }
        if(validarValor(valor)){
            Excecao ex = new Excecao("Valor Inválido digite novamente!");
            throw ex;
        }else{
        valor =  valor.replace(",", ".");
         dao  = new EntradaDAO();
        entrada  = new Entrada();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = s.parse(data);
        entrada.setData(d);
        entrada.setValor(Double.parseDouble(valor));
        entrada.setTipo_pgto("Dinheiro");
        entrada.setPgto(1);
        entrada.setDescricao("Abertura do Caixa data: "+data);
        dao.salvar(entrada);
        JOptionPane.showMessageDialog(null,"Caixa Aberto com Sucesso!Valor Inicial: "+valor);
        }
        }
public void fechacaixa(){
        Cad_Caixa c = new Cad_Caixa();
        p = new Principal();
        c.setVisible(false);
        p.setVisible(true);
        
    }
public Double retornaValor(){
    this.dao = new EntradaDAO();
    List<Entrada>lista = dao.listarEntradas();
    Double total = 0.0;
    for (Entrada lista1 : lista) {
        total = total+= lista1.getValor();
    }
    return total;
    
}
public List<Entrada>listarEntradas(){
    this.dao = new EntradaDAO();
    List<Entrada> lista = dao.listarEntradas();
    return lista;
}
public List<Entrada>listarEntradasData(String data){
    this.dao = new EntradaDAO();
    List<Entrada> lista = dao.listarEntradasData(data);
    return lista;
}
public List<Entrada>listarEntradasDataDinheiro(String data){
    this.dao = new EntradaDAO();
    List<Entrada> lista = dao.listarEntradasDataDinheiro(data);
    return lista;
}
public List<Entrada>listarEntradasDataCartao(String data){
    this.dao = new EntradaDAO();
    List<Entrada> lista = dao.listarEntradasDataCartao(data);
    return lista;
}




public void AlterarEntrada(Integer id,String descricao, String data, String valor,int pgto,String tipoPgto)throws Excecao, ParseException, Exception{

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
        entrada = new Entrada();
        dao = new EntradaDAO();
        valor = valor.replace(",",".");
        entrada.setId(id);
        entrada.setDescricao(descricao);
        entrada.setPgto(pgto);
        entrada.setTipo_pgto(tipoPgto);
        entrada.setValor(Double.parseDouble(valor));
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = s.parse(data);
        entrada.setData(d);
        dao.atualizar(entrada);
        JOptionPane.showMessageDialog(null,"Entrada Alterada com Sucesso!");
        
    }  
}
public void deletarEntrada(Entrada entrada){
           int resposta = JOptionPane.showConfirmDialog(null, "Tem Certeza que deseja apagar?");
                   if(resposta == JOptionPane.YES_OPTION){
           EntradaDAO dao = new EntradaDAO();
           
           dao.deletar(entrada);
           JOptionPane.showMessageDialog(null,"Entrada apagada com sucesso!");
           
       }  
    }

public Entrada buscaIdEntrada(String desc){
        EntradaDAO dao = new EntradaDAO();
        Entrada entrada = new Entrada();
        entrada = dao.buscaEntradaNome(desc);
        return entrada;
    }


}
