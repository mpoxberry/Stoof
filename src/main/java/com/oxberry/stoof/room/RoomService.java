package com.oxberry.stoof.room;

import com.oxberry.stoof.model.Room;
import com.oxberry.stoof.repository.RoomRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Service
@AllArgsConstructor
@Slf4j
public class RoomService {

    RoomRepository roomRepository;

    public void save(Room room) {
        log.info("inside RoomService save");
        room.setCreatedTimestamp(ZonedDateTime.now(ZoneId.of("America/New_York")));
        roomRepository.save(room);
    }

    public void delete(Room room) {
        log.info("inside RoomService delete(entity)");
        roomRepository.delete(room);
    }

    public void deleteById(int id){
        log.info("inside RoomService delete(id)");
        roomRepository.deleteById(id);
    }
}
