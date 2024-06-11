package com.oxberry.stoof.controller;

import com.oxberry.stoof.model.Room;
import com.oxberry.stoof.service.RoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class RoomController {

    private RoomService roomService;

    @PostMapping("/rest/room")
    public void save(@RequestBody Room room) {
        log.info("inside RoomController save");
        roomService.save(room);
    }

    @DeleteMapping("rest/room/{id}")
    public void deleteById(@PathVariable("id") int roomId) {
        log.info("inside RoomController deleteById");
        roomService.deleteById(roomId);
    }

}
