package com.graphql.coffee.interfaces;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graphql.coffee.application.CoffeeUseCase;

import graphql.ExecutionResult;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/coffees")
@RestController
public class CoffeeController {
	private final CoffeeUseCase coffeeUseCase;

	@PostMapping
	public ResponseEntity<Object> getCoffeeByQuery(@RequestBody String query) {
		ExecutionResult execute = coffeeUseCase.execute(query);

		return new ResponseEntity<>(execute, HttpStatus.OK);
	}
}
