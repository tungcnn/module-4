package services;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.IUserRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserService implements IUserService {
    @Autowired
    private IUserRepo userRepo;

    @Override
    public List<User> get() {
        return userRepo.get();
    }

    @Override
    public boolean delete(int id) {
        return userRepo.delete(id);
    }

    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }
}
