package fr.epita.coffemachine.repository;

import fr.epita.coffemachine.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {


}
