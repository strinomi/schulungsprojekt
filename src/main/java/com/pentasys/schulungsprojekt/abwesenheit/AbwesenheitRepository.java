package com.pentasys.schulungsprojekt.abwesenheit;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
@RepositoryRestResource(collectionResourceRel = "abwesenheit", path = "abwesenheit")
public interface AbwesenheitRepository extends PagingAndSortingRepository<Abwesenheit, UUID> {
};
