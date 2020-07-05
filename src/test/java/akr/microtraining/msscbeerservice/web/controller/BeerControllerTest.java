package akr.microtraining.msscbeerservice.web.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import akr.microtraining.brewery.model.BeerDto;
import akr.microtraining.brewery.model.BeerStyleEnum;
import akr.microtraining.msscbeerservice.bootstrap.BeerLoader;
import akr.microtraining.msscbeerservice.services.BeerService;
import akr.microtraining.msscbeerservice.web.controller.BeerController;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
   @Autowired
    ObjectMapper objectMapper;	
   
   @MockBean
   BeerService beerService;
	
	@Test
	void getBeerId() throws Exception {

		given(beerService.getById(any(), anyBoolean())).willReturn(getValidBeerDto());
		
		mockMvc.perform(get("/api/v1/beer/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk());
		
	}

	   @Test
	    void saveNewBeer() throws Exception {

	        BeerDto beerDto = getValidBeerDto();
	        String beerDtoJson = objectMapper.writeValueAsString(beerDto);
	        
	        given(beerService.saveNewBeer(any())).willReturn(getValidBeerDto());

	        mockMvc.perform(post("/api/v1/beer/")
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(beerDtoJson))
	                .andExpect(status().isCreated());
	    }

	    @Test
	    void updateBeerById() throws Exception {
	    	 
	    	given(beerService.updateBeer(any(), any())).willReturn(getValidBeerDto());
	    	
	        BeerDto beerDto = getValidBeerDto();
	        String beerDtoJson = objectMapper.writeValueAsString(beerDto);

	        mockMvc.perform(put("/api/v1/beer/" + UUID.randomUUID().toString())
	                .contentType(MediaType.APPLICATION_JSON)
	                .content(beerDtoJson))
	                .andExpect(status().isNoContent());
	    }
	    
	    public BeerDto getValidBeerDto() {
	    	
	    	return BeerDto.builder()
	    			.beerName("Carlos Alberto")
	    			.beerStyle(BeerStyleEnum.LAGER)
	    			.upc(BeerLoader.BEER_1_UPC)
	    			.price(new BigDecimal(2.99))
	    			.build();
	    	
	    }	    

}
