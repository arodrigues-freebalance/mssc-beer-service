package akr.trainingmicro.msscbeerservice.web.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akr.trainingmicro.msscbeerservice.web.model.BeerDto;
import akr.trainingmicro.msscbeerservice.web.model.BeerStyleEnum;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

//    private final BeerService beerService;
//
//    public BeerController(BeerService beerService) {
//        this.beerService = beerService;
//    }
	
	
	@GetMapping({"/{beerId}"})
	public ResponseEntity<BeerDto> getBeerId(@PathVariable("beerId") UUID beerId){
		
		//return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);

		
		return new ResponseEntity<BeerDto>(BeerDto.builder().id(UUID.randomUUID())
	                .beerName("Galaxy Cat")
	                .beerStyle(BeerStyleEnum.LAGER)
	                .build(),HttpStatus.OK);
		
		
	}
	
	
    @PostMapping // POST - create new beer
    public ResponseEntity<BeerDto> saveNewBear(@Valid @RequestBody BeerDto beerDto){

//        BeerDto savedDto = beerService.saveNewBeer(beerDto);
//
//        HttpHeaders headers = new HttpHeaders();
//        //todo add hostname to url
//        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity<BeerDto>(HttpStatus.CREATED);
    }	
    
    @PutMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDto beerDto){

//        beerService.updateBeerById(beerId, beerDto);

        return new ResponseEntity<BeerDto>(HttpStatus.NO_CONTENT);
    }    
	
}
