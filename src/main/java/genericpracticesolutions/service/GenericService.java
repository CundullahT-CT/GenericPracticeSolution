package genericpracticesolutions.service;

import java.util.List;

public interface GenericService<T> {

    T create(T obj);

    T update(T obj) throws Exception;

    T readById(Integer id) throws Exception;

    List readAll();

    void delete(T obj) throws Exception;

}
