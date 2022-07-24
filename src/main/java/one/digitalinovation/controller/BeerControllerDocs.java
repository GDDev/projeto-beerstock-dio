package one.digitalinovation.controller;

import java.util.List;

import one.digitalinovation.dto.BeerDTO;
import one.digitalinovation.exception.BeerAlreadyRegisteredException;
import one.digitalinovation.exception.BeerNotFoundException;

public interface BeerControllerDocs {
    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;
    public BeerDTO findByName(String name) throws BeerNotFoundException;
    public List<BeerDTO> listBeers();
    public void deleteById(Long id) throws BeerNotFoundException;
}
