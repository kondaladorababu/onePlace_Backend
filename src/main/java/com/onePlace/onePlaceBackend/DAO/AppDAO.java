package com.onePlace.onePlaceBackend.DAO;

import com.onePlace.onePlaceBackend.Entity.OneHomeSprintItem;

import java.util.List;

public interface AppDAO {

    void add(OneHomeSprintItem sprintItem);

    OneHomeSprintItem get(int id);

    List<OneHomeSprintItem> getAll();

    OneHomeSprintItem update(OneHomeSprintItem sprintItem);

    void delete(int id);
}
