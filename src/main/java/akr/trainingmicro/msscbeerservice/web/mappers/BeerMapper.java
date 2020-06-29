package akr.trainingmicro.msscbeerservice.web.mappers;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import akr.trainingmicro.msscbeerservice.domain.Beer;
import akr.trainingmicro.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

	BeerDto beerToBeerDto(Beer beer);
	
	BeerDto beerToBeerDtoWithInventory(Beer beer);
	
	Beer beerDtoToBeer(BeerDto beerDto);
	
}
