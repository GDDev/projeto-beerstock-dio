package one.digitalinovation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinovation.entity.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long>{
    
    Optional<Beer> findByName(String name); 

}
