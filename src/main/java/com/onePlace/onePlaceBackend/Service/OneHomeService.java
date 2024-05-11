package com.onePlace.onePlaceBackend.Service;

import com.onePlace.onePlaceBackend.Entity.OneHomeSprintItem;

public interface OneHomeService {
    void add(OneHomeSprintItem sprintItem);

    OneHomeSprintItem get(int id);

    OneHomeSprintItem update(OneHomeSprintItem sprintItem);

    void delete(int id);

}
