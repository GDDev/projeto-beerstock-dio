package one.digitalinovation.controller;

import java.util.List;
import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import one.digitalinovation.dto.BeerDTO;
import one.digitalinovation.exception.BeerAlreadyRegisteredException;
import one.digitalinovation.exception.BeerNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface BeerControllerDocs {
    public BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;
    public BeerDTO findByName(String name) throws BeerNotFoundException;
    public List<BeerDTO> listBeers();
    public void deleteById(Long id) throws BeerNotFoundException;
}
