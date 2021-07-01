package com.graphql.coffee.application;

import org.springframework.stereotype.Service;

import graphql.ExecutionResult;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CoffeeUseCase {
	private final CoffeeDetails coffeeDetails;

	public ExecutionResult execute(String query) {
		return coffeeDetails.execute(query);
	}
}
