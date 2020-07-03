package akr.trainingmicro.msscbeerservice.services.brewing;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import akr.trainingmicro.msscbeerservice.config.JmsConfig;
import akr.trainingmicro.msscbeerservice.domain.Beer;
import akr.trainingmicro.msscbeerservice.events.BrewBeerEvent;
import akr.trainingmicro.msscbeerservice.events.NewInventoryEvent;
import akr.trainingmicro.msscbeerservice.repositories.BeerRepository;
import akr.trainingmicro.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class BrewBeerListener {

	private final BeerRepository beerRepository;
	private final JmsTemplate jmsTemplate;
	
	@Transactional
	@JmsListener(destination = JmsConfig.BREWING_REQUEST_QUEUE)
	public void listen(BrewBeerEvent brewBeerEvent) {
		
		BeerDto beerDto = brewBeerEvent.getBeerDto();
		
		Beer beer = beerRepository.getOne(beerDto.getId());
		
		beerDto.setQuantityOnHand(beer.getQuantityToBrew());
		
		log.debug("Brewed beer: " + beer.getMinOnHand() + " : QOH: " + beerDto.getQuantityOnHand());
		
		NewInventoryEvent newInventoryEvent = new NewInventoryEvent(beerDto);
		
		jmsTemplate.convertAndSend(JmsConfig.NEW_INVENTORY_QUEUE, newInventoryEvent);
		

		
		
		
	}
	
}
 