package com.hlsijx.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaTest {

    @Resource
    private KafkaProducerService kafkaProducerService;

    @Test
    public void sendMessage(){

        String topic = "hello-spark";
        for (int i = 0; i < 10; i++) {
            kafkaProducerService.sendMessage(topic, "hello spark " + i);
        }

        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
