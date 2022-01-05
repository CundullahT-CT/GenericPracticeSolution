package genericpracticesolutions.service.implementation;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public abstract class GenericService<T>  {

    protected Map<Integer, T> map = new HashMap<>();

    T create(Integer id, T obj) {
        map.put(id, obj);
        return obj;
    }

    T update(Integer id, T obj) throws Exception {

        if (map.get(id) == null) {
            throw new Exception("404 Not Found!");
        }

        map.put(id, obj);

        return obj;

    }

    T readById(Integer id) throws Exception {

        if (map.get(id) == null) {
            throw new Exception("404 Not Found!");
        }

        return map.get(id);

    }

    List<T> readAll() {
        return new ArrayList<>(map.values());
    }

    void delete(T obj) throws Exception {

        if (!map.entrySet().contains(obj)) {
            throw new Exception("404 Not Found!");
        }

        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));

    }

}
