package com.challenge.ingerencia.feign.hackernew.impl;

import com.challenge.ingerencia.feign.hackernew.HackerNewClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class HackerNewFacade {

    private final HackerNewClient hackerNewClient;

    public Map<String, Object> getHackerNewsByLanguage(final String language){
        return hackerNewClient.getByLanguage(language);
    }
}
