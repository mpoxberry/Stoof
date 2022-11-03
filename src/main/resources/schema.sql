DROP TABLE IF EXISTS BULDING;
CREATE TABLE BUILDING (
    building_id INT AUTO_INCREMENT PRIMARY KEY,
    building_name VARCHAR(128),
    description VARCHAR(256)
);

DROP TABLE IF EXISTS ENTITY;
CREATE TABLE ENTITY (
    entity_id INT AUTO_INCREMENT PRIMARY KEY,
    entity_name VARCHAR(128) NOT NULL,
    description VARCHAR(256),
    type_id INT,
    date_of_purchase VARCHAR(50),
    purchase_value FLOAT,
    location_id INT
);

DROP TABLE IF EXISTS ENTITY_TYPE;
CREATE TABLE ENTITY_TYPE (
    entity_type_id INT AUTO_INCREMENT PRIMARY KEY,
    entity_type_name VARCHAR(128) NOT NULL,
    description VARCHAR(256)
);

DROP TABLE IF EXISTS LOCATION;
CREATE TABLE LOCATION (
    location_id INT AUTO_INCREMENT PRIMARY KEY,
    building_id INT,
    building_name VARCHAR(128),
    description VARCHAR(256)
);