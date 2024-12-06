package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Speaker;
import com.pluralsight.conference.service.SpeakerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakerController {

    private static final Logger log = LoggerFactory.getLogger(SpeakerController.class.getName());

    private final SpeakerService speakerService;

    public SpeakerController(SpeakerService speakerService) {
        this.speakerService = speakerService;
    }

    @GetMapping
    public List<Speaker> getSpeakers() {
        return speakerService.findAll();
    }

    @PutMapping
    public Speaker createSpeaker(@RequestBody Speaker speaker) {
        log.info("Name: {}", speaker.getName());

        return speakerService.create(speaker);
    }
}
