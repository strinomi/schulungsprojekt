package com.pentasys.schulungsprojekt.projekt;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
@RepositoryRestResource(collectionResourceRel = "projekt", path = "projekt")
public interface ProjektRepository extends PagingAndSortingRepository<Projekt, UUID> {
};
