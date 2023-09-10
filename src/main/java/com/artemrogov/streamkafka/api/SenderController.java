package com.artemrogov.streamkafka.api;


import com.artemrogov.streamkafka.exchange.business.ProducerMessage;
import com.artemrogov.streamkafka.exchange.simple.ProducerData;
import com.artemrogov.streamkafka.model.MessageBusinessDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SenderController {
    private final ProducerData producerData;
    private final ProducerMessage producerMessage;

    @PostMapping(value = "/send-simple-message")
    public ResponseEntity<Boolean> sendSimpleMessage(){
        String message = "Hello Kafka!";
        return ResponseEntity.ok(producerData.publish(message));
    }

    @PostMapping(value = "/publish-message")
    public ResponseEntity<Boolean> publishMessage(@RequestBody MessageBusinessDto request){
        return ResponseEntity.ok(producerMessage.publishMessage(request));
    }
}
