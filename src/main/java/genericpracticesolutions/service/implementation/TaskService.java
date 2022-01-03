package genericpracticesolutions.service.implementation;

import genericpracticesolutions.pojo.Task;
import genericpracticesolutions.service.IGenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService extends GenericService<Task> implements IGenericService<Task> {

    @Override
    public Task create(Task obj) {
        return super.create(obj.getId(), obj);
    }

    @Override
    public Task update(Task obj) throws Exception {
        return super.update(obj.getId(), obj);
    }

    @Override
    public Task readById(Integer id) throws Exception {
        return super.readById(id);
    }

    @Override
    public List<Task> readAll() {
        return super.readAll();
    }

    @Override
    public void delete(Task obj) throws Exception {
        super.delete(obj);
    }

}
