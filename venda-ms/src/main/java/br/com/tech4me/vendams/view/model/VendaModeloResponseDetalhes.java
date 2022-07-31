package br.com.tech4me.vendams.view.model;

import java.util.List;

import br.com.tech4me.vendams.compartilhado.Produto;

public class VendaModeloResponseDetalhes {
    private String codigo;
    private Integer quantidade;
    private String dataVenda;
    private Float valorVenda;
    private String produtoVenda;
    private List<Produto> produto;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public Float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(Float valorVenda) {
        this.valorVenda = valorVenda;
    }
    public String getProdutoVenda() {
        return produtoVenda;
    }
    public void setProdutoVenda(String produtoVenda) {
        this.produtoVenda = produtoVenda;
    }
    public List<Produto> getProduto() {
        return produto;
    }
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}
