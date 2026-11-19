package fr.epita.coffemachine.controller;


import fr.epita.coffemachine.dto.CoffeeDto;
import fr.epita.coffemachine.dto.CreateCoffeeDto;
import fr.epita.coffemachine.service.CoffeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("coffees")
public class CoffeeController {

    private final CoffeeService coffeeService;


    @PostMapping
    public CoffeeDto create(@RequestBody @Valid CreateCoffeeDto dto) {
        return coffeeService.create(dto) ;
    }

    @GetMapping
    List<CoffeeDto> coffees(){
        return coffeeService.allCoffees();
    }

    @GetMapping("{id}")
    ResponseEntity<CoffeeDto> coffee(@PathVariable Long id){
        return coffeeService.oneCoffee(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
