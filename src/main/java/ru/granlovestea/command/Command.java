package ru.granlovestea.command;

import ru.granlovestea.model.entity.User;

public abstract class Command {
    protected User sender;

    public Command(User sender) {
        this.sender = sender;
    }

    public abstract void execute();
}
