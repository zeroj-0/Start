package com.zero.Start.DB;

import org.h2.jdbcx.JdbcDataSource;

public class ConfigDB {

    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/yeongjeong/Study/anotherProject/start";
    private static final String USER_ID = "zero";
    private static final String USER_PASSWORD = "zero";
    public static final JdbcDataSource jdbcDataSource = new JdbcDataSource();

    public ConfigDB() {
        jdbcDataSource.setURL(DB_URL);
        jdbcDataSource.setUser(USER_ID);
        jdbcDataSource.setPassword(USER_PASSWORD);
    }


}
