package com.artemrogov.streamkafka.exchange.simple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import java.util.function.Consumer;

@Component
@Slf4j
public class ConsumerData {
    @Bean(name = "messageProcessorChannel")
    public Consumer<Message<String>> messageProcessorChannel(){
        return msg-> log.info("message receiver: " + msg.getPayload());
    }
}
