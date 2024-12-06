package com.pluralsight.conference;

import com.pluralsight.conference.model.Speaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class Spring6jdbc3ApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(Spring6jdbc3ApplicationTests.class);
    public static final String URL = "http://localhost:8081/api/v1/speakers";
    RestTemplate restTemplate;

    @BeforeEach
    void setup() {
        restTemplate = new RestTemplate();
    }

    @DisplayName("Test Create Speaker")
    @Test
    void testCreateSpeaker() {
        Speaker speaker = new Speaker();
        speaker.setName("John Henry");
        restTemplate.put(URL, speaker);

        assertNotNull(speaker, "Speaker is not null");
        assertEquals("John Henry", speaker.getName(), "Speaker name is John Henry");
        assertEquals(10, speaker.getName().length(), "Speaker name has 10 characters");
        assertTrue(speaker.getName().startsWith("J"), "Speaker name starts with J");
    }

    @DisplayName("Test Get Speakers")
    @Test
    void testGetSpeakers() {

        ResponseEntity<List<Speaker>> speakersResponse = restTemplate.exchange(
                URL, HttpMethod.GET,
                null, new ParameterizedTypeReference<>() {
                });

        assertNotNull(speakersResponse.getBody(), "Body is not null");

        List<Speaker> speakers = speakersResponse.getBody();

        for (Speaker speaker : speakers) {
            log.info("Speaker name: {} ", speaker.getName());
        }
    }
}
