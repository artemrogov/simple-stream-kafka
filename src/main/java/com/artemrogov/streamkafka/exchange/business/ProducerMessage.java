package com.artemrogov.streamkafka.exchange.business;


import com.artemrogov.streamkafka.model.MessageBusinessDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ProducerMessage {
    private final StreamBridge streamBridge;

    public boolean publishMessage(MessageBusinessDto messageBusinessDto){
        return streamBridge.send("messageAuthorsChannel-out-0",messageBusinessDto);
    }
}
