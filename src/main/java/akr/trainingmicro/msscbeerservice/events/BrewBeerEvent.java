package akr.trainingmicro.msscbeerservice.events;

import akr.trainingmicro.msscbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{

	private static final long serialVersionUID = -8558398587421818653L;

	public BrewBeerEvent(BeerDto beerDto) {
		super(beerDto);			
	}


}
