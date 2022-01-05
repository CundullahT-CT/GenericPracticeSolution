package genericpracticesolutions.service.implementation;

import genericpracticesolutions.model.Project;
import genericpracticesolutions.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends GenericServiceImpl<Project> implements GenericService<Project> {

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
