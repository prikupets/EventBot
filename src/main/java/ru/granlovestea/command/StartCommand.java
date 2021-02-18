package ru.granlovestea.command;

import ru.granlovestea.model.entity.User;

public class StartCommand extends Command {
    public StartCommand(User sender) {
        super(sender);
    }

    @Override
    public void execute() {

    }
}
