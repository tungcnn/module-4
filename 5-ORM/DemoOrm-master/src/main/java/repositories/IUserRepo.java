package repositories;

import entities.User;

import java.util.List;

public interface IUserRepo {
    List<User> get();
    boolean delete(int id);
}
