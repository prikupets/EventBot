package ru.granlovestea.model.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.granlovestea.model.entity.Event;

import java.util.ArrayList;
import java.util.List;

public class Events {
    private static final Logger LOGGER = LoggerFactory.getLogger(Events.class);
    private List<Event> events = new ArrayList<>();

    //TODO: save to file
    private boolean add(Event event) {
        if(events.contains(event)) {
            LOGGER.warn("{} already in repository, can't add it", event);
            return false;
        } else {
            events.add(event);
            return true;
        }
    }

    private Event getById(long id) {
        return events.stream()
                .filter(event -> event.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // not sure I need that
//    public List<Event> getAll() {
//        return events;
//    }

    //TODO: remove from file
    private boolean remove(Event event) {
        if(events.remove(event)) {
            return true;
        } else {
            LOGGER.warn("{} not in repository, can't remove it", event);
            return false;
        }
    }
}
