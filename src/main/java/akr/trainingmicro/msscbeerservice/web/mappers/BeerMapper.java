package akr.trainingmicro.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;

import akr.trainingmicro.msscbeerservice.domain.Beer;
import akr.trainingmicro.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

	BeerDto beerToBeerDto(Beer beer);
	
	Beer beerDtoToBeer(BeerDto beerDto);
	
}
