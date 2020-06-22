package akr.trainingmicro.msscbeerservice.services;

import java.util.UUID;

import akr.trainingmicro.msscbeerservice.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	BeerDto saveNewBeer(BeerDto beerDto);

	void updateBeerById(UUID beerId, BeerDto beerDto);

}
