package org.raccoon.springex.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {

    @Autowired
    private DataSource dataSource;

//    @Autowired
//    private SampleService sampleService;
//
//    @Test
//    public void testService1() {
//        log.info(sampleService);
//        Assertions.assertNotNull(sampleService);
//
//    }
    @Test
    public void testConnection() throws Exception {
        Connection connection = dataSource.getConnection();
        log.info(connection);
        Assertions.assertNotNull(connection);
        connection.close();
    }
}
