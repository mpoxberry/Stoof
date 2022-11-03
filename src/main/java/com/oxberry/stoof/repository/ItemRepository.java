package com.oxberry.stoof.repository;

import com.oxberry.stoof.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
