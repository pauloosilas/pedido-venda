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
public class PesquisaProdutoBean {
    
    private List<Integer> produtosFiltrados;

    public PesquisaProdutoBean(){
       produtosFiltrados  = new ArrayList<>();
       for(int i = 0 ; i < 50; i++){
           produtosFiltrados.add(i);
       }
    }
    
    
    
    /**
     * @return the produtosFiltrados
     */
    public List<Integer> getProdutosFiltrados() {
        return produtosFiltrados;
    }

    /**
     * @param produtosFiltrados the produtosFiltrados to set
     */
    public void setProdutosFiltrados(List<Integer> produtosFiltrados) {
        this.produtosFiltrados = produtosFiltrados;
    }
    
    
}
