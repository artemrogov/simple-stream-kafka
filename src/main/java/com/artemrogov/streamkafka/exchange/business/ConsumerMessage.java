package com.artemrogov.streamkafka.exchange.business;


import com.artemrogov.streamkafka.model.MessageBusinessDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class ConsumerMessage {
    @Bean(name = "readerAuthorMessages")
    public Consumer<Message<MessageBusinessDto>> readerAuthorMessages(){
        return msg-> log.info("New Message Author: author: " + msg.getPayload().getAuthor() + " message: " + msg.getPayload().getBody());
    }
}
