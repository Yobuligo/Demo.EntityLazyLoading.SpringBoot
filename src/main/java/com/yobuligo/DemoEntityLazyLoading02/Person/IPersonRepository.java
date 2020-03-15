package com.yobuligo.DemoEntityLazyLoading02.Person;

import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Long> {

}
