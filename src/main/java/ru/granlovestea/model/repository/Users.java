package ru.granlovestea.model.repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.granlovestea.model.entity.User;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private static final Logger LOG = LoggerFactory.getLogger(Users.class);
    private List<User> users = new ArrayList<>();

    //TODO: save to file
    public boolean add(User user) {
        if(users.contains(user)) {
            LOG.warn("{} already in repository, can't add it", user);
            return false;
        } else {
            users.add(user);
            return true;
        }
    }

    public User getById(long id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // not sure I need that
//    public List<User> getAll() {
//        return users;
//    }

    //TODO: remove to file
    public boolean remove(User user) {
        if(users.remove(user)) {
            return true;
        } else {
            LOG.warn("{} not in repository, can't remove it", user);
            return false;
        }
    }
}
