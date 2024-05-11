package com.onePlace.onePlaceBackend.Service;

import com.onePlace.onePlaceBackend.DAO.AppDAO;
import com.onePlace.onePlaceBackend.Entity.OneHomeSprintItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OneHomeServiceImpl implements OneHomeService{

    private final AppDAO appDAO;

    @Autowired
    public OneHomeServiceImpl(AppDAO theAppDAO){
        this.appDAO=theAppDAO;
    }

    @Override
    @Transactional
    public void add(OneHomeSprintItem sprintItem) {
        appDAO.add(sprintItem);
    }

    @Override
    public OneHomeSprintItem get(int id) {
        return appDAO.get(id);
    }

    @Override
    public OneHomeSprintItem update(OneHomeSprintItem sprintItem) {
        return appDAO.update(sprintItem);
    }

    @Override
    @Transactional
    public void delete(int id) {
        appDAO.delete(id);
    }
}
