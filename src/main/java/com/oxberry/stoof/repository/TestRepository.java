package com.oxberry.stoof.repository;

import com.oxberry.stoof.model.Item;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class TestRepository extends SimpleJpaRepository<Item, Long> {
    public TestRepository(Class<Item> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
    }
}
