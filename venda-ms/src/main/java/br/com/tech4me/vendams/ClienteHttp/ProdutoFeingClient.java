package br.com.tech4me.vendams.ClienteHttp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tech4me.vendams.compartilhado.Produto;

@FeignClient(name = "produto-ms", fallback = ProdutoFeingClientFallback.class)
public interface ProdutoFeingClient {
    
    @GetMapping(path = "/api/produto/{nome}/lista")
    List<Produto> obterProdutos(@PathVariable String nome);
}
    @Component
    class ProdutoFeingClientFallback implements ProdutoFeingClient{

        @Override
        public List<Produto> obterProdutos(String nome){
            return new ArrayList<>();
        }
    }

