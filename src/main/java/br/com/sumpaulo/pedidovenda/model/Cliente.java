/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sumpaulo.pedidovenda.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author paulo
 */
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
     
   
    private long id;
    
    private String nome;
    private String email;
    private String documentoReceitaFederal;
    private TipoPessoa tipo;
    
    private List<Endereco> enderecos = new ArrayList<>();
    /**
     * @return the nome
     */
    
    @Column(nullable = false, length = 100)
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    @Column(nullable = false, length = 120 )
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the documentoReceitaFederal
     */
    @Column(name="doc_receita_federal" , length= 16 , nullable=false)
    public String getDocumentoReceitaFederal() {
        return documentoReceitaFederal;
    }

    /**
     * @param documentoReceitaFederal the documentoReceitaFederal to set
     */
    public void setDocumentoReceitaFederal(String documentoReceitaFederal) {
        this.documentoReceitaFederal = documentoReceitaFederal;
    }

    /**
     * @return the enderecos
     */
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * @param enderecos the enderecos to set
     */
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    /**
     * @return the tipo
     */
    @Enumerated(EnumType.STRING)
    @Column(name="tipo_pessoa", length= 15 , nullable = false)
    public TipoPessoa getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the id
     */
    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    
    
    
}
