package genericpracticesolutions.service.implementation;

import genericpracticesolutions.model.Project;
import genericpracticesolutions.service.IGenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService extends GenericService<Project> implements IGenericService<Project> {

    @Override
    public Project create(Project obj) {
        return super.create(obj.getId(), obj);
    }

    @Override
    public Project update(Project obj) throws Exception {
        return super.update(obj.getId(), obj);
    }

    @Override
    public Project readById(Integer id) throws Exception {
        return super.readById(id);
    }

    @Override
    public List<Project> readAll() {
        return super.readAll();
    }

    @Override
    public void delete(Project obj) throws Exception {
        super.delete(obj);
    }

}
