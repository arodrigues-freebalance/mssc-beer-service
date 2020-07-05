package akr.microtraining.msscbeerservice.events;

import akr.microtraining.brewery.model.BeerDto;
import akr.microtraining.brewery.model.events.BeerEvent;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent{

	private static final long serialVersionUID = -8558398587421818653L;

	public BrewBeerEvent(BeerDto beerDto) {
		super(beerDto);			
	}


}
