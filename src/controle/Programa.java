/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.text.ParseException;
import visao.Cad_Agenda;
import visao.Caixa_altera;
import visao.CaixaVisao;
import visao.ConsultarCaixa;
import visao.ConsultarDiaFuncionario;
import visao.Fechamento_func;
import visao.Principal;

/**
 *
 * @author darlan
 */
public class Programa {
    private CaixaControle caixa;
    private FuncionarioControle func;
    private ConsultarCaixa consCaixa;
    private Cad_Agenda cadAgenda;
    private ConsultarDiaFuncionario conFunc;
    private Fechamento_func fecFunc;
    
    public static void main(String []args) throws ParseException {
        Principal p = new Principal();
      p.setVisible(true);
      
    
    
    }
    public void chamaCaixa(){
        caixa = new CaixaControle();
        caixa.abreCaixa();
    }
    public void chamaCadFuncionario(){
        func = new FuncionarioControle();
        func.abreCadastroFuncionario();
    }
    public void chamaVisaoCaixa(){
        CaixaVisao cv = new CaixaVisao();
        cv.setVisible(true);
        
    }
    public void chamaConsultaCaixa(){
        this.consCaixa = new ConsultarCaixa();
        this.consCaixa.setVisible(true);
    }
    public void chamaCadAgenda(){
        this.cadAgenda = new Cad_Agenda();
        this.cadAgenda.setVisible(true);
    }
    public void chamaConsultarDiaFuncionario(){
    this.conFunc = new ConsultarDiaFuncionario();
    this.conFunc.setVisible(true);
    }
    public void chamaFechamentoFunc(){
        this.fecFunc = new Fechamento_func();
        this.fecFunc.setVisible(true);
    }
    public void chamaAlteraCaixa(){
        caixa = new CaixaControle();
        caixa.abreTelaAlteraCaixa();
        
    }
}
