package com.onePlace.onePlaceBackend.DAO;

import com.onePlace.onePlaceBackend.Entity.OneHomeSprintItem;

public interface AppDAO {

    void add(OneHomeSprintItem sprintItem);

    OneHomeSprintItem get(int id);

    OneHomeSprintItem update(OneHomeSprintItem sprintItem);

    void delete(int id);
}
