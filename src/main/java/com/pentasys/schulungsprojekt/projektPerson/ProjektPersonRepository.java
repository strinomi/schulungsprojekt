package com.pentasys.schulungsprojekt.projektPerson;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
@RepositoryRestResource(collectionResourceRel = "projektPerson", path = "projektPerson")
public interface ProjektPersonRepository extends PagingAndSortingRepository<ProjektPerson, UUID> {
};
