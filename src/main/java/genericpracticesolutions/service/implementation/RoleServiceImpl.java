package genericpracticesolutions.service.implementation;

import genericpracticesolutions.model.Role;
import genericpracticesolutions.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends GenericServiceImpl<Role> implements GenericService<Role> {

    @Override
    public Role create(Role obj) {
        return super.create(obj.getId(), obj);
    }

    @Override
    public Role update(Role obj) throws Exception {
        return super.update(obj.getId(), obj);
    }

    @Override
    public Role readById(Integer id) throws Exception {
        return super.readById(id);
    }

    @Override
    public List<Role> readAll() {
        return super.readAll();
    }

    @Override
    public void delete(Role obj) throws Exception {
        super.delete(obj);
    }

}
