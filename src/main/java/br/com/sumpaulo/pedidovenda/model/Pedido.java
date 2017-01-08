/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sumpaulo.pedidovenda.model;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author paulo
 */
@Entity
@Table(name= "pedido")
public class Pedido implements Serializable{
    
   // private static final long serialVersionUID = 1L;
    
    
    private Long id;
    private Date dataCriacao;
    private String observacao;
    private Date dataEntrega;
    private BigDecimal valorFrete;
    private BigDecimal valorTotal;
    private BigDecimal valorDesconto;
    private StatusPedido status;
    private FormaPagamento formaPagamento;
    private Usuario vendedor;
    private Cliente cliente;
    private EnderecoEntrega enderecoEntrega;
    private List<ItemPedido> itensPedido = new VirtualFlow.ArrayLinkedList<>();

    /**
     * @return the id
     */
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the dataCriacao
     */
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_criacao", nullable = false)
    public Date getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @return the observacao
     */
    @Column(columnDefinition = "text")
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the dataEntrega
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "data_entrega", nullable = false)
    public Date getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the valorFrete
     */
    @Column(name = "valor_frete", nullable = false, precision = 10, scale = 2)
    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    /**
     * @param valorFrete the valorFrete to set
     */
    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    /**
     * @return the valorTotal
     */
   @Column(name = "valor_total", nullable = false, precision = 10, scale = 2)
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the valorDesconto
     */
     @Column(name = "valor_desconto", nullable = false, precision = 10, scale = 2)
     public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    /**
     * @param valorDesconto the valorDesconto to set
     */
    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    /**
     * @return the status
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    public StatusPedido getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    /**
     * @return the formaPagamento
     */
    
    @Enumerated(EnumType.STRING)
    @Column(name="forma_pagamento" , nullable = false, length = 20)
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the vendedor
     */
    @ManyToOne
    @JoinColumn(name = "vendedor_id", nullable = false)
    public Usuario getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the cliente
     */
    @ManyToOne
    @JoinColumn(name="cliente_id", nullable = false)
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the enderecoEntrega
     */
    @Embedded
    public EnderecoEntrega getEnderecoEntrega() {
        return enderecoEntrega;
    }

    /**
     * @param enderecoEntrega the enderecoEntrega to set
     */
    public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    /**
     * @return the itensPedido
     */
    @OneToMany(mappedBy = "pedido" , cascade = CascadeType.ALL, orphanRemoval = true)
    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    /**
     * @param itensPedido the itensPedido to set
     */
    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

}

