package com.breadmore.coronaline.service;

import com.breadmore.coronaline.constant.EventStatus;
import com.breadmore.coronaline.dto.EventDTO;
import com.breadmore.coronaline.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventRepository eventRepository;
    public List<EventDTO> getEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDatetime,
            LocalDateTime eventEndDatetime) {
        return null;
    }
    public Optional<EventDTO> getEvent(Long eventId){
        return Optional.empty();
    }
    public boolean createEvent(EventDTO eventDTO){
        return true;
    }
    public boolean modifyEvent(Long eventId, EventDTO eventDTO){
        return true;
    }

    public boolean removeEvent(Long eventId){
        return true;
    }
}
