package akr.trainingmicro.msscbeerservice.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

public class Beer {

	private  UUID id;	
	private Long version;
	
	private Timestamp createdDate;
	private Timestamp lastModifiedDate;
	private String beerName;
	private String beerStyle;
	private Long upc;
	private BigDecimal price;
	
	private Integer minOnHand;
	private Integer quantityToBrew;
	
	
	
}
