package akr.microtraining.msscbeerservice.services.order;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import akr.microtraining.brewery.model.events.ValidateOrderRequest;
import akr.microtraining.brewery.model.events.ValidateOrderResult;
import akr.microtraining.msscbeerservice.config.JmsConfig;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class BeerOrderValidationListener {

    private final BeerOrderValidator validator;
    private final JmsTemplate jmsTemplate;

    @JmsListener(destination = JmsConfig.VALIDATE_ORDER_QUEUE)
    public void listen(ValidateOrderRequest validateOrderRequest){
        Boolean isValid = validator.validateOrder(validateOrderRequest.getBeerOrder());

        jmsTemplate.convertAndSend(JmsConfig.VALIDATE_ORDER_RESPONSE_QUEUE,
                ValidateOrderResult.builder()
                    .isValid(isValid)
                    .orderId(validateOrderRequest.getBeerOrder().getId())
                    .build());
    }
}