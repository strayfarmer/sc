package com.ampei.framework.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * // Map map = JSONObject.parseObject(value, Map.class);
 * // String aiDataStr = String.valueOf(map.get("data"));//去掉kafka头部信息
 * @author pam
 * @version 1.0
 * @description
 * @date 2021/6/16 11:32
 */
@Slf4j
//@Component
public class KafkaConsumer {

    @KafkaListener(topics = "aaa")
    public void onDataResultMessage(ConsumerRecord record) {
        String topic = String.valueOf(record.topic());
        String partition = String.valueOf(record.partition());
        String value = String.valueOf(record.value());
        log.info("receive ai result msg,topic->{},partition->{},value->{},{}", topic, partition, value, System.currentTimeMillis());
    }

    @KafkaListener(topics = "bbb")
    public void onCtlResultMessage(ConsumerRecord record) {
        String topic = String.valueOf(record.topic());
        String partition = String.valueOf(record.partition());
        String value = String.valueOf(record.value());
        log.info("receive ctl result msg,topic->{},partition->{},value->{}", topic, partition, value);
        log.info("7777777777777777777");
    }

}
