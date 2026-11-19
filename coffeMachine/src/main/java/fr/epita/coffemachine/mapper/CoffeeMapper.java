package fr.epita.coffemachine.mapper;

import fr.epita.coffemachine.dto.CoffeeDto;
import fr.epita.coffemachine.dto.CreateCoffeeDto;
import fr.epita.coffemachine.entity.Coffee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CoffeeMapper {

    CoffeeDto toDto(Coffee coffee);


    @Mapping(target = "id", ignore = true)
    Coffee toEntity(CreateCoffeeDto dto);


}

