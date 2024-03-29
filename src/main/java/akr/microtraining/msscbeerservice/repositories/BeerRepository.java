package akr.microtraining.msscbeerservice.repositories;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import akr.microtraining.brewery.model.BeerStyleEnum;
import akr.microtraining.msscbeerservice.domain.Beer;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
	
    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);

	Beer findByUpc(String upc);	

}
