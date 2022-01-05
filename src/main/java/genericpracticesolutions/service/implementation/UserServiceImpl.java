package genericpracticesolutions.service.implementation;

import genericpracticesolutions.model.User;
import genericpracticesolutions.service.GenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends GenericServiceImpl<User> implements GenericService<User> {

    @Override
    public User create(User obj) {
        return super.create(obj.getId(), obj);
    }

    @Override
    public User update(User obj) throws Exception {
        return super.update(obj.getId(), obj);
    }

    @Override
    public User readById(Integer id) throws Exception {
        return super.readById(id);
    }

    @Override
    public List<User> readAll() {
        return super.readAll();
    }

    @Override
    public void delete(User obj) throws Exception {
        super.delete(obj);
    }

}
