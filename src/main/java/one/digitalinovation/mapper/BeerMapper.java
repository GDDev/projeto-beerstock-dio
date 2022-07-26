package one.digitalinovation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import one.digitalinovation.dto.BeerDTO;
import one.digitalinovation.entity.Beer;

@Mapper
public interface BeerMapper {
    
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);

}
