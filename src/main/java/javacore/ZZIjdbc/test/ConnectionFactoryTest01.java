package javacore.ZZIjdbc.test;

import javacore.ZZIjdbc.conn.ConnectionFactory;
import javacore.ZZIjdbc.dominio.Producer;
import javacore.ZZIjdbc.repository.ProducerRepository;
import javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

import static javacore.ZZIjdbc.service.ProducerService.update;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();
//        ProducerService.save(producer);
//        ProducerService.delete(4);
//        update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info(producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers update '{}'", producers);
//       ProducerService.findByNameAndDelete("A-1 pictures");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("B or X'= 'X");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bones");
//        log.info("Producers update '{}'", producers);
//          ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("Bo");
        log.info("Producers found '{}'", producers);
    }
}
