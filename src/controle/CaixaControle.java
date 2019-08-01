/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dominio.Caixa;
import dominio.CaixaDAO;
import dominio.Excecao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import visao.Cad_Caixa;
import visao.Caixa_altera;
import visao.Principal;

/**
 *
 * @author darlan
 */
public class CaixaControle {
    private Principal p = new Principal();
    
    public void abreCaixa(){
        Cad_Caixa c = new Cad_Caixa();
        c.setVisible(true);
    }
    public void fechacaixa(){
        Cad_Caixa c = new Cad_Caixa();
        c.setVisible(false);
        p.setVisible(true);
        
    }
    public void abreTelaAlteraCaixa(){
        Caixa_altera cai = new Caixa_altera();
       cai.setVisible(true);
        
        
        
    }
    public void salvarCaixa(String data,String valor) throws ParseException,Excecao{
        if(validarData(data)){
            Excecao ex = new Excecao("Data Inválida!Digite novamente!");
            throw ex;
        }
        if(validaValor(valor)){
            Excecao ex = new Excecao("Valor Inválido digite novamente!");
            throw ex;
        }else{
        valor =  valor.replace(",", ".");
         CaixaDAO dao = new CaixaDAO();
        Caixa caixa = new Caixa();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = s.parse(data);
        caixa.setData(d);
        caixa.setValor_entrada(Double.parseDouble(valor));
        dao.salvar(caixa);
        JOptionPane.showMessageDialog(null,"Caixa Aberto com Sucesso!Valor Inicial: "+valor);
        }
        }
    public boolean validaValor(String valor){
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(valor);
        return !matcher.find();
    }
    public boolean validarData(String data){
        return data.length() == 0;
}
   
    
}