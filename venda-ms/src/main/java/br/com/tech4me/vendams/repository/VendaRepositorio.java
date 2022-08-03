package br.com.tech4me.vendams.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.tech4me.vendams.compartilhado.Produto;
import br.com.tech4me.vendams.model.Venda;

@Repository
public interface VendaRepositorio extends MongoRepository<Venda, String> {
    Optional<Produto> findByCodigo(String codigo);
}
