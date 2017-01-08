/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sumpaulo.pedidovenda.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author paulo
 */
@Entity
@Table(name="item_pedido")
public class ItemPedido implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
   
    private long id;
    private Integer quantidade;
    private BigDecimal valorUnitario;
    private Produto produto;
    private Pedido pedido;
    
    
    /**
     * @return the quantidade
     */
    @Column(nullable = false, length = 3 )
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
   
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitario
     */
    @Column(name = "valor_unitario", precision = 10, scale = 2, nullable = false)
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    /**
     * @return the produto
     */
    @ManyToOne
    @JoinColumn(name="pedido_id", nullable = false)
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
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

    /**
     * @return the pedido
     */
    @ManyToOne
    @JoinColumn(name="pedido_id" , nullable = false)
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
