package com.zero.Start.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
public class ConfigDB {

    // 스프링부트뜰때 application.property값 다 읽는애
    @Autowired
    Environment env;

    @Autowired
    DataSource dataSource;

    @Test
    void 확인() throws SQLException {
        System.out.println(dataSource);

        HikariDataSource hikariDataSource = (HikariDataSource) dataSource;
        System.out.println(hikariDataSource.getJdbcUrl());
        System.out.println("property = " + env.getProperty("spring.datasource.url"));

        System.out.println(dataSource.getConnection());

        Assertions.assertThat(env.getProperty("spring.datasource.url")).isEqualTo(hikariDataSource.getJdbcUrl());
    }
}
