package com.oxberry.stoof.item;

import com.oxberry.stoof.model.Item;
import com.oxberry.stoof.repository.ItemRepository;
import com.oxberry.stoof.repository.TestRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ItemService {

    ItemRepository itemRepository;

    TestRepository testRepository;

    public void upsert(Item item) {
        log.info("inside ItemService saveOrUpdate");
        itemRepository.save(item);
    }

    public List<Item> getAll() {
        return testRepository.findAll();
    }
}
