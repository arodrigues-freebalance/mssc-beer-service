package akr.microtraining.brewery.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9104396346096376623L;
	
	@Null
	private UUID id;
	@Null
	private Integer version;
	@Null
	 @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape= Shape.STRING)
	private OffsetDateTime createdDate;
	@Null
	 @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape= Shape.STRING)
	private OffsetDateTime lastModifiedDate;
	@NotBlank
	private String beerName;
	@NotNull
	private BeerStyleEnum beerStyle;
	
	@NotNull
	private String upc;
	
	@Positive
	@NotNull
	@JsonFormat(shape = Shape.STRING)
	private BigDecimal price;
	
	private Integer quantityOnHand;
	
}
