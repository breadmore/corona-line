package com.breadmore.coronaline.service;

import com.breadmore.coronaline.constant.EventStatus;
import com.breadmore.coronaline.dto.EventDTO;
import com.breadmore.coronaline.repository.EventRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EventServiceTest {

    private EventService sut;
    @Mock
    private EventRepository eventRepository;

    @DisplayName("검색 조건 없이 결과 출력 ")
    @Test
    void givenNothing_test() {
        // Given


        // When
        List<EventDTO> list = sut.getEvents(null, null, null, null, null);


        // Then
        assertThat(list).hasSize(2);
    }

    @DisplayName("검색 조건 있을떄 결과 출력 ")
    @Test
    void givenSearchParams_test() {
        // Given
        Long placeId = 1L;
        String eventName = "오전운동";
        EventStatus eventStatus = EventStatus.OPENED;
        LocalDateTime eventStartDatetime = LocalDateTime.of(2021, 1, 1, 0, 0);
        LocalDateTime eventEndDatetime = LocalDateTime.of(2021, 1, 1, 0, 0);

        // When
        List<EventDTO> list = sut.getEvents(placeId, eventName, eventStatus, eventStartDatetime, eventEndDatetime);


        // Then
        assertThat(list)
                .hasSize(1)
                .allSatisfy(event -> {
                    assertThat(event)
                            .hasFieldOrPropertyWithValue("placeId", placeId)
                            .hasFieldOrPropertyWithValue("eventName", eventName)
                            .hasFieldOrPropertyWithValue("eventStatus", eventStatus);
                    assertThat(event.eventStartDatetime()).isAfterOrEqualTo(eventStartDatetime);
                    assertThat(event.eventStartDatetime()).isBeforeOrEqualTo(eventStartDatetime);
                });
    }

}