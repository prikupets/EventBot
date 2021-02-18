package ru.granlovestea.update;

import ru.granlovestea.model.entity.User;

public abstract class Update {
    private User sender;

    protected Update(User sender) {
        this.sender = sender;
    }

    public User getSender() {
        return sender;
    }
}
