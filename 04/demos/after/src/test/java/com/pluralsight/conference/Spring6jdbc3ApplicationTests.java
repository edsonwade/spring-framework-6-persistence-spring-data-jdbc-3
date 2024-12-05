package com.pluralsight.conference;

import com.pluralsight.conference.model.Speaker;
import org.junit.jupiter.api.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class Spring6jdbc3ApplicationTests {

    @Test
    public void testCreateSpeaker() {
        RestTemplate restTemplate = new RestTemplate();

        Speaker speaker = new Speaker();
        speaker.setName("John Henry");

        restTemplate.put("http://localhost:8080/speaker", speaker);
    }

    @Test
    void testGetSpeakers() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Speaker>> speakersResponse = restTemplate.exchange(
                "http://localhost:8080/speaker", HttpMethod.GET,
                null, new ParameterizedTypeReference<>() {
                });

        assertNotNull(speakersResponse.getBody(), "Body is null");

        List<Speaker> speakers = speakersResponse.getBody();

        for (Speaker speaker : speakers) {
            System.out.println("Speaker name: " + speaker.getName());
        }
    }
}
