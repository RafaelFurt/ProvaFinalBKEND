package br.com.tech4me.vendams.ClienteHttp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.tech4me.vendams.compartilhado.Produto;
import br.com.tech4me.vendams.repository.VendaRepositorio;

@FeignClient(name = "produto-ms", fallback = ProdutoFeingClientFallback.class)
public interface ProdutoFeingClient {
    
    @GetMapping(path = "/api/produto/{codigo}/lista")
    List<Produto> obterProdutos(@PathVariable String codigo);
}
    @Component
    class ProdutoFeingClientFallback implements ProdutoFeingClient{

        @Override
        public List<Produto> obterProdutos(String codigo){
            return new ArrayList<>();
        }
        @Autowired
        private VendaRepositorio repo;
        
        @PutMapping(path = "/api/produto/{codigo}/{quantidade}")
        public Optional<Produto> obterPorCodigo(@PathVariable @RequestBody String codigo){
            Optional<Produto> produto = repo.findByCodigo(codigo);
            if(produto.isPresent()){
                return Optional.of(new ModelMapper().map(produto.get(),Produto.class));
            }
            return Optional.empty();
        }


    }



