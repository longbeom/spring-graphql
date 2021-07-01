package com.graphql.coffee.application;

import org.springframework.stereotype.Component;

import com.graphql.coffee.domain.repository.CoffeeRepository;

import graphql.ExecutionResult;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class CoffeeProvider implements CoffeeDetails {

	private final CoffeeRepository coffeeRepository;

	@Override
	public ExecutionResult execute(String query) {
		return null;
	}
}
