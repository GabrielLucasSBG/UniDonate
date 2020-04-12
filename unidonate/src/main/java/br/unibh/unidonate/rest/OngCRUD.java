package br.unibh.unidonate.rest;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.unibh.unidonate.entities.Ong;


@RepositoryRestResource(collectionResourceRel = "ong", path = "ong")
public interface OngCRUD extends CrudRepository<Ong, Long> {


}
