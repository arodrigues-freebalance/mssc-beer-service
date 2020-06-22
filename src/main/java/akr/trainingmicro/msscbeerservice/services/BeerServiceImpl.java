package akr.trainingmicro.msscbeerservice.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import akr.trainingmicro.msscbeerservice.web.model.BeerDto;
import akr.trainingmicro.msscbeerservice.web.model.BeerStyleEnum;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
	       return BeerDto.builder().id(UUID.randomUUID())
	                .beerName("Galaxy Cat")
	                .beerStyle(BeerStyleEnum.LAGER)
	                .build();	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
	       return BeerDto.builder()
	                .id(UUID.randomUUID())
	                .build();
	}

	@Override
	public void updateBeerById(UUID beerId, BeerDto beerDto) {
		// TODO impl - would add a real impl to update beer		
	}

}
