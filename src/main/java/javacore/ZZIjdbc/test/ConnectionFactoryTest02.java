package javacore.ZZIjdbc.test;

import javacore.ZZIjdbc.dominio.Producer;
import javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("mad").build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("-------------------");
//        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
    }
}
