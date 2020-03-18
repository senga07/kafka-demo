package com.hlsijx.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaComsumerService {

    @KafkaListener(groupId = "test", topics = "hello-spark")
    public void onMessage(ConsumerRecord<String, Object> record,
                          Acknowledgment acknowledgment, Consumer<?, ?> consumer){
        log.info("消费端接收消息{}", record.value());

        //手工签收
//        acknowledgment.acknowledge();
    }
}
