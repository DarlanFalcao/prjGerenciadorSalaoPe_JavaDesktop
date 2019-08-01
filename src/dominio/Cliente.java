/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author darlan
 */

@Entity
@Table(name ="tbt_cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name ="cliente_id")
    private Integer id;
    @Column(name = "cli_nome",nullable = false )
    private String nome;
    @Column(name = "cli_cpf",nullable = false,length = 11)
    private String cpf;
    @Column(name = "cli_rua",nullable = false)
    private String rua;
    @Column(name = "cli_cidade",nullable = false)
    private String cidade;
    @Column(name = "cli_bairro",nullable = false)
    private String bairro;
    @Column(name = "cli_numero",nullable = false)
    private int numero;
    @Column(name = "cli_telefone",nullable = false)
    private String telefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf(){
    
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Excecao{
        if((rua == null)||(rua.length()==0)){
            throw new Excecao("Digite a rua!");
        }
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade)throws Excecao{
        if((cidade == null)||(cidade.length()==0)){
            throw new Excecao("Digite a cidade!");
        }
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro){
        
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
