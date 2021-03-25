package com.techspirit.casein.repository.api;

import com.techspirit.casein.model.BaseEntity;
import com.techspirit.casein.model.profile.User;

import java.util.Base64;
import java.util.List;

public interface Repository<E extends BaseEntity> {

    // null if not found, when updated
    E save(E entity);

    // false if not found
    boolean delete(int id);

    // null if not found
    E get(int id);
}
