package com.graphql.coffee.application;

import graphql.ExecutionResult;

public interface CoffeeDetails {
	ExecutionResult execute(String query);
}