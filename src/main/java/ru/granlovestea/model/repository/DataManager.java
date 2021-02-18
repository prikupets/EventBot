package ru.granlovestea.model.repository;

public class DataManager {
    private Events events;
    private Users users;

    public DataManager() {
        //TODO: load events and users from file
    }

    public Events getEvents() {
        return events;
    }

    public Users getUsers() {
        return users;
    }
}
