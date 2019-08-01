/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author darlan
 */
@Entity
@Table(name = "tbl_servico")
public class Servico {
   
    @Id  
    @SequenceGenerator ( name = "pk_sequence" , sequenceName = "servico_id_seq" , allocationSize = 1 ) 
    @GeneratedValue ( strategy = GenerationType.AUTO , generator = "pk_sequence" ) 
    @Column ( name = "servico_id" , unique = true , nullable = false ) 
    private Integer id;
    @Column(name = "serv_descricao",nullable = false)
    private String descricao;
    @Column(name = "serv_valor",nullable = false)
    private Double valor;
    @Column(name = "serv_pago",nullable = false)
    private int pago;
    @Column(name = "serv_data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "serv_hora")
    private String hora;
    @Column(name = "serv_tipo_pgto")
    private String tipo_pgto;
    @ManyToOne
    private Funcionario funcionario;
    
        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo_pgto() {
        return tipo_pgto;
    }

    public void setTipo_pgto(String tipo_pgto) {
        this.tipo_pgto = tipo_pgto;
    }
    
}
