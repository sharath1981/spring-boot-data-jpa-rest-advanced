package com.datajparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datajparest.resource.Person;

@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long> {

}
