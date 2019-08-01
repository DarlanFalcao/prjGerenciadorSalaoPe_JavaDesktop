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
@Table(name = "tbl_caixa")
public class Caixa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "caixa_id")
    private Integer id;
    @Temporal(TemporalType.DATE)
    @Column(name = "caixa_data",nullable = false)
    private Date data;
    @Column(name = "caixa_valorentrada",nullable = false)
    private Double valor_entrada;
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor_entrada() {
        return valor_entrada;
    }

    public void setValor_entrada(Double valor_entrada) {
        this.valor_entrada = valor_entrada;
    }

    
    
    
}
