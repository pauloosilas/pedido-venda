/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sumpaulo.pedidovenda.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author paulo
 */
@ManagedBean
@ViewScoped
public class CadastroPedidosBean {
    
    private List<Integer> itens;
    
    public CadastroPedidosBean(){
        itens = new ArrayList<>();
        itens.add(1);
    }

    /**
     * @return the itens
     */
    public List<Integer> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<Integer> itens) {
        this.itens = itens;
    }
    
    
    
}
