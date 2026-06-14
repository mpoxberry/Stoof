package com.oxberry.stoof;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class StoofApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void sqliteDatasourceIsAvailable() {
        jdbcTemplate.update("DROP TABLE IF EXISTS test_table");
        jdbcTemplate.update("CREATE TABLE test_table (id INTEGER PRIMARY KEY, name TEXT NOT NULL)");
        jdbcTemplate.update("INSERT INTO test_table (id, name) VALUES (1, 'stoof')");

        Integer count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM test_table WHERE name = 'stoof'", Integer.class);

        assertEquals(1, count);
    }

}
