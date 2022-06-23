package com.breadmore.coronaline.repository;

import com.breadmore.coronaline.constant.EventStatus;
import com.breadmore.coronaline.dto.EventDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface EventRepository {
    default List<EventDTO> findEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDatetime,
            LocalDateTime eventEndDatetime
    ) {
        return List.of();
    }

    default Optional<EventDTO> findEvent(Long eventId) {
        return Optional.empty();
    }

    default boolean insertEvent(EventDTO eventDTO) {
        return false;
    }

    default boolean updateEvent(Long EventId, EventDTO eventDTO) {
        return false;
    }

    default boolean deleteEvent(Long EventId) {
        return false;
    }

}
