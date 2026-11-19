package fr.epita.coffemachine.service;

import fr.epita.coffemachine.dto.CoffeeDto;
import fr.epita.coffemachine.dto.CreateCoffeeDto;

import java.util.List;
import java.util.Optional;

public interface CoffeeService {


    List<CoffeeDto> allCoffees();
    Optional<CoffeeDto> oneCoffee(Long id);
    CoffeeDto create(CreateCoffeeDto dto);


}
