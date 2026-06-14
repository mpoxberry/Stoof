package com.oxberry.stoof.room.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oxberry.stoof.room.model.Location;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class LocationDAO {

    private final JdbcTemplate jdbcTemplate;

    public int create(Location location) {
        String sql = """
                INSERT INTO location (createUser, createTimestamp, lastUpdateUser, lastUpdateTimestamp,
                                      locationName, description)
                VALUES (?, ?, ?, ?, ?, ?)
                """;

        return jdbcTemplate.update(
                sql,
                location.getCreateUser(),
                location.getCreateTimestamp() != null ? location.getCreateTimestamp().toString() : null,
                location.getLastUpdateUser(),
                location.getLastUpdateTimestamp() != null ? location.getLastUpdateTimestamp().toString() : null,
                location.getLocationName(),
                location.getDescription());
    }
}

