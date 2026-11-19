package fr.epita.coffemachine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class Coffee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;


    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Coffee() {

    }
}
