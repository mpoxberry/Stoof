package com.oxberry.stoof.service;

import com.oxberry.stoof.model.Item;
import com.oxberry.stoof.repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ItemService {

    ItemRepository entityRepository;

    public void upsert(Item item) {
        log.info("inside ItemService saveOrUpdate");
        entityRepository.save(item);
    }
}
