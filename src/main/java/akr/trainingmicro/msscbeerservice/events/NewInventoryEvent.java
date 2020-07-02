package akr.trainingmicro.msscbeerservice.events;

import akr.trainingmicro.msscbeerservice.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent{

	private static final long serialVersionUID = -870119210138969042L;

	public NewInventoryEvent(BeerDto beerDto) {
		super(beerDto);			
	}


}
