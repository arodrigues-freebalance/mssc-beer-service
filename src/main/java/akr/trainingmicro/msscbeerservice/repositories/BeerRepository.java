package akr.trainingmicro.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import akr.trainingmicro.msscbeerservice.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, Long> {
	
	

}
