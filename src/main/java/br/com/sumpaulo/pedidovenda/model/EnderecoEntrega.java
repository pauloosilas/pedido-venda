/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sumpaulo.pedidovenda.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author paulo
 */
@Embeddable
public class EnderecoEntrega {
   
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;

    /**
     * @return the logradouro
     */
    @Column(name="entrega_logradouro" , nullable = false, length = 150)
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numero
     */
    @Column(name="entrega_numero" , nullable = false, length = 20)
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    @Column(name="entrega_complemento" , nullable = false, length = 150)
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the cidade
     */
    @Column(name="entrega_cidade" , nullable = false , length = 60)
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the uf
     */
    @Column(name="entrega_uf" , nullable = false , length = 60)
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the cep
     */
    @Column(name="entrega_cep" , nullable = false , length = 15)
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}
