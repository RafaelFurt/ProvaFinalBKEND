package br.com.tech4me.produtoms.view.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class ProdutoModeloInclusao {

    private String id;
    @NotBlank(message = "O nome não pode estar em branco")
    @NotEmpty(message = "O nome não pode estar vazio")
    private String nome;
    @NotBlank(message = "O codigo não pode estar em branco")
    @NotEmpty(message = "O codigo não pode estar vazio")
    private String codigo;
    private double preco;
    private Integer estoque;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
