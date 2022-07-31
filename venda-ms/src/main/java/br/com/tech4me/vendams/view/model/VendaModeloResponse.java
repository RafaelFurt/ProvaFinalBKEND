package br.com.tech4me.vendams.view.model;

public class VendaModeloResponse {

    private String codigo;
    private Integer quantidade;
    private String dataVenda;
    private Float valorVenda;
    private String produto;
    
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
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
}
