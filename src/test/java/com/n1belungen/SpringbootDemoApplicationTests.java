package com.n1belungen;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    DataSource dataSource;


    @Test
    void contextLoads() throws SQLException {

        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        System.out.println(druidDataSource.getMaxActive());
        System.out.println(druidDataSource.getInitialSize());


        connection.close();
    }

}
