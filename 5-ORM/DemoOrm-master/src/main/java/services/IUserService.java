package services;

import entities.User;

import java.util.List;

public interface IUserService {
    List<User> get();
    boolean delete(int id);
    boolean
    create(User user);
    boolean update(User user);
}
