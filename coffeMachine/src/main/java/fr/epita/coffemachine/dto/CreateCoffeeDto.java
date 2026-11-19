package fr.epita.coffemachine.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CreateCoffeeDto(
        @NotBlank(message = "Coffee name cannot be null") String name,
        @Positive(message = "Price should be positive") int price
) {
}
