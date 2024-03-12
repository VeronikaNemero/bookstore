package by.teachmeskills.store.repository;

import by.teachmeskills.store.entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static final String FILE_PATH = "D:\\coding\\с72\\bookstore\\src\\main\\resources\\users";

    @Override
    public void add(User user) {

//        allUsers().add(user);
        List<User>users=allUsers();
        users.add(user);
        serialization(users);
    }

    @Override
    public void deleteByID(Long userID) {

    }

    @Override
    public List<User> allUsers() {

        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<User> users = (List<User>) objectInputStream.readObject();
            if(users == null) {
                return new ArrayList<>();
            }
            return users;
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void serialization(List<User>users) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
