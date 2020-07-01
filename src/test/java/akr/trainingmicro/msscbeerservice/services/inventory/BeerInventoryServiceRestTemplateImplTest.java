package akr.trainingmicro.msscbeerservice.services.inventory;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled // utility for manual testing
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getOnhandInventory() {
//        Integer qoh = beerInventoryService.getOnhandInventory(UUID.fromString("74c844f2-3038-4d7e-b1b2-b3c66223fd9f"));
//
//        System.out.println(qoh);

    }

}
