package by.teachmeskills.store.repository;

import by.teachmeskills.store.entity.Product;
import by.teachmeskills.store.entity.User;

import java.util.Collection;
import java.util.List;

public interface UserRepository {

    public void add(User user);

    public void deleteByID(Long userID);

    public Collection<User> allUsers();
}
