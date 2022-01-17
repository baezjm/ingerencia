package com.challenge.ingerencia.controller;

import com.challenge.ingerencia.service.HackerNewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/news/language")
@RequiredArgsConstructor
public class ChallengeController {

    private final HackerNewService hackerNewService;

    @GetMapping(value = "/{language}")
    Map<String, Object> getNewsByLanguage(@PathVariable(value = "language") String language) {
        return hackerNewService.getHackerNewsByLanguage(language);
    }
}
