package ru.granlovestea.command;

import ru.granlovestea.model.entity.User;

public class CreateEventCommand extends Command {
    public CreateEventCommand(User sender) {
        super(sender);
    }

    @Override
    public void execute() {

    }
}
