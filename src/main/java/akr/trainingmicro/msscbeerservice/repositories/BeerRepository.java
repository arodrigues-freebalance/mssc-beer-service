package akr.trainingmicro.msscbeerservice.repositories;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import akr.trainingmicro.msscbeerservice.domain.Beer;
import akr.trainingmicro.msscbeerservice.web.model.BeerStyleEnum;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
	
    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);

	Beer findByUpc(String upc);	

}
