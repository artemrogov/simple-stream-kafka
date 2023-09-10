## Spring cloud stream Kafka broker binder

Docker compose config:

- kafka broker
- kafka ui - graphical admin dashboard for kafka broker
- zookeeper kafka

kafka topics:
 - simple_data - send simple text
 - messages_authors - messages authors

#### Package and components:

- The class ConsumerMessage from the package ```package com.artemrogov.streamkafka.exchange.business``` is used to accept messages from the topic - messages_authors
- The class ProducerMessage from the package ```package com.artemrogov.streamkafka.exchange.business``` used to send messages to a topic - messages_authors
- The class ConsumerData from the package ```package com.artemrogov.streamkafka.exchange.simple``` is used to accept messages from the topic - simple_data
- The class ProducerData from the package ```package com.artemrogov.streamkafka.exchange.simple``` used to send messages to a topic - simple_data

#### Send simple message to simple_data topic kafka:

```bash 
curl -XPOST http://localhost:9000/send-simple-message

```

#### Send message authors to messages_authors topic kafka:

```bash

curl --location 'http://localhost:9000/publish-message' \
--header 'Content-Type: application/json' \
--data '{
    "author":"Xeng Yourk",
    "body":"My China Message!!"
}'

```

#### Links help: 

1. [Documentation Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/html/spring-cloud-stream.html#_configuration_options)
2. [Spring Cloud Stream Kafka Binder](https://docs.spring.io/spring-cloud-stream/docs/current/reference/html/spring-cloud-stream-binder-kafka.html#_kafka_streams_consumer_properties)