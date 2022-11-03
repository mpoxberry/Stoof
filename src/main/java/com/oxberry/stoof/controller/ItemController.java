package com.oxberry.stoof.controller;

import com.oxberry.stoof.model.Item;
import com.oxberry.stoof.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class ItemController {

    private ItemService entityService;

    @PostMapping("/rest/item")
    public void saveOrUpdateItem(@RequestBody Item entity) {
        log.info("inside ItemController saveOrUpdate");
        entityService.upsert(entity);
    }
}
