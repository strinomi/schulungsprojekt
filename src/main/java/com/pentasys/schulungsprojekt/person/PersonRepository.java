package com.pentasys.schulungsprojekt.person;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, UUID> {
};
