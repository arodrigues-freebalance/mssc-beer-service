package akr.microtraining.msscbeerservice.events;

import akr.microtraining.common.events.BeerDto;
import akr.microtraining.common.events.BeerEvent;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent{

	private static final long serialVersionUID = -8558398587421818653L;

	public BrewBeerEvent(BeerDto beerDto) {
		super(beerDto);			
	}


}
