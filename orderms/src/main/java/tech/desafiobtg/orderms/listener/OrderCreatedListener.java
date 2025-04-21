package tech.desafiobtg.orderms.listener;

import org.springframework.stereotype.Component;

import tech.desafiobtg.orderms.listener.dto.OrderCreatedEvent;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

import static tech.desafiobtg.orderms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;


@Component
public class OrderCreatedListener {

private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

        @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){
        logger.info("Mensagem consumida: {}", message);
    }
 


}
