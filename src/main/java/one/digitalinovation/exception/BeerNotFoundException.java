package one.digitalinovation.exception;

public class BeerNotFoundException extends Exception{

    public BeerNotFoundException(String beerName) {
        super(String.format("Beer with name %s is not registered in the system.", beerName));
    }

    public BeerNotFoundException(Long id) {
        super(String.format("Beer with the id %l is not registered in the system.", id));
    }

}
