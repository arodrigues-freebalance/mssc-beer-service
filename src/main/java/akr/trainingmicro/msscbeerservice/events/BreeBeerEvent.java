package akr.trainingmicro.msscbeerservice.events;

import akr.trainingmicro.msscbeerservice.web.model.BeerDto;

public class BreeBeerEvent extends BeerEvent{

	private static final long serialVersionUID = -8558398587421818653L;

	public BreeBeerEvent(BeerDto beerDto) {
		super(beerDto);			
	}


}
