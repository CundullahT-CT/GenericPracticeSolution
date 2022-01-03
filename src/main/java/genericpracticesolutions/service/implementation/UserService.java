package genericpracticesolutions.service.implementation;

import genericpracticesolutions.pojo.User;
import genericpracticesolutions.service.IGenericService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends GenericService<User> implements IGenericService<User> {

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
