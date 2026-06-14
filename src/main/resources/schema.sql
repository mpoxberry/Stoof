DROP TABLE IF EXISTS room;
DROP TABLE IF EXISTS building;
DROP TABLE IF EXISTS location;

CREATE TABLE room (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    createUser TEXT,
    createTimestamp TEXT,
    lastUpdateUser TEXT,
    lastUpdateTimestamp TEXT,
    roomName TEXT,
    squareFootage REAL,
    ceilingHeight REAL,
    numberOfWindows INTEGER,
    buldingId INTEGER
);

CREATE TABLE building (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    createUser TEXT,
    createTimestamp TEXT,
    lastUpdateUser TEXT,
    lastUpdateTimestamp TEXT,
    buldingName TEXT,
    description TEXT
);

CREATE TABLE location (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    createUser TEXT,
    createTimestamp TEXT,
    lastUpdateUser TEXT,
    lastUpdateTimestamp TEXT,
    locationName TEXT,
    description TEXT
);
