package com.onePlace.onePlaceBackend.DAO;

import com.onePlace.onePlaceBackend.Entity.OneHomeSprintItem;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDAOImpl implements AppDAO {

    private final EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void add(OneHomeSprintItem sprintItem) {
        entityManager.persist(sprintItem);
    }

    @Override
    public OneHomeSprintItem get(int id) {
        return entityManager.find(OneHomeSprintItem.class, id);
    }

    @Override
    @Transactional
    public OneHomeSprintItem update(OneHomeSprintItem sprintItem) {
        return entityManager.merge(sprintItem);
    }

    @Override
    @Transactional
    public void delete(int id) {
        OneHomeSprintItem sprintItem = entityManager.find(OneHomeSprintItem.class, id);
        entityManager.remove(sprintItem);
    }
}
