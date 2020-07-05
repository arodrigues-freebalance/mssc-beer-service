package akr.microtraining.msscbeerservice.services;

import java.util.UUID;

import org.springframework.data.domain.PageRequest;

import akr.microtraining.brewery.model.BeerDto;
import akr.microtraining.brewery.model.BeerPagedList;
import akr.microtraining.brewery.model.BeerStyleEnum;

public interface BeerService {
	
	BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

	BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

	BeerDto saveNewBeer(BeerDto beerDto);

	BeerDto updateBeer(UUID beerId, BeerDto beerDto);

	BeerDto  getByUpc(String upc);

}
