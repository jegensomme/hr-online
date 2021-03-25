package com.techspirit.casein.repository.api;

public interface DependentRepository<E> {

    // null if not found, when updated
    E save(E entity, int pid);

    // false if not found
    boolean delete(int id, int pid);

    // null if not found
    E get(int id, int pid);
}
