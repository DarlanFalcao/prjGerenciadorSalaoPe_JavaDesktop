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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author darlan
 */

@Entity
@Table(name = "tbl_entrada")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_entrada")
    private Integer id;
    @Column(name = "ent_descricao",nullable = false)
    private String descricao;
    @Column(name = "ent_valor",nullable = false)
    private Double valor;
    @Column(name = "ent_data",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name="ent_pgto",nullable = false)
    private int pgto;
    @Column(name = "ent_tipo_pgto",nullable = false)
    private String tipo_pgto;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) throws Exception{
        
        this.data = data;
    }

    public int getPgto() {
        return pgto;
    }

    public void setPgto(int pgto) {
        this.pgto = pgto;
    }

    public String getTipo_pgto() {
        return tipo_pgto;
    }

    public void setTipo_pgto(String tipo_pgto) {
        this.tipo_pgto = tipo_pgto;
    }
    
}
