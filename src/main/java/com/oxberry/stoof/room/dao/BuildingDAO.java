package com.oxberry.stoof.room.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oxberry.stoof.room.model.Building;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class BuildingDAO {

    private final JdbcTemplate jdbcTemplate;

    public int create(Building building) {
        String sql = """
                INSERT INTO building (createUser, createTimestamp, lastUpdateUser, lastUpdateTimestamp,
                                      buldingName, description)
                VALUES (?, ?, ?, ?, ?, ?)
                """;

        return jdbcTemplate.update(
                sql,
                building.getCreateUser(),
                building.getCreateTimestamp() != null ? building.getCreateTimestamp().toString() : null,
                building.getLastUpdateUser(),
                building.getLastUpdateTimestamp() != null ? building.getLastUpdateTimestamp().toString() : null,
                building.getBuldingName(),
                building.getDescription());
    }
}
