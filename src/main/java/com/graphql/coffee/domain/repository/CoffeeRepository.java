package com.graphql.coffee.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.coffee.domain.Coffee;

public interface CoffeeRepository extends JpaRepository<Coffee, String> {

}
