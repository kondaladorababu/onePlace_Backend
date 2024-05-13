package com.onePlace.onePlaceBackend.DAO;

import com.onePlace.onePlaceBackend.Entity.OneHomeSprintItem;
import com.onePlace.onePlaceBackend.ExceptionHandler.oneHomeSprintItemsExceptionHandlers.SprintItemNotFoundException;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        OneHomeSprintItem sprintItem = entityManager.find(OneHomeSprintItem.class, id);
        if (sprintItem == null) {
            throw new SprintItemNotFoundException("Sprint Item Does Not Exists: ");
        }
        return sprintItem;
    }

    @Override
    public List<OneHomeSprintItem> getAll() {
        return entityManager.createQuery("SELECT s FROM OneHomeSprintItem s", OneHomeSprintItem.class).getResultList();
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
        if (sprintItem == null) {
            throw new SprintItemNotFoundException("Sprint Item Does Not Exists: ");
        }
        entityManager.remove(sprintItem);
    }
}
