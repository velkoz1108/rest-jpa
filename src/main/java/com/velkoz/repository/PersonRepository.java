package com.velkoz.repository;

import com.velkoz.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-4 13:56 星期六
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

//  访问  http://localhost:8080/api/persons/search/findByNameStartsWith?name=2

    Person findByNameStartsWith(@Param("name") String name);

}
