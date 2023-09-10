package com.artemrogov.streamkafka.exchange.simple;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ProducerData {
    private final StreamBridge streamBridge;
    private static final String CHANNEL_NAME = "messagesSenderChannel-out-0";
    public boolean publish(String message){
        return streamBridge.send(CHANNEL_NAME,message);
    }
}
