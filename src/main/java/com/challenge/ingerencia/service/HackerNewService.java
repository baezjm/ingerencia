package com.challenge.ingerencia.service;

import com.challenge.ingerencia.feign.hackernew.impl.HackerNewFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class HackerNewService {

    private final HackerNewFacade hackerNewFacade;

    public Map<String, Object> getHackerNewsByLanguage (final String language){
        if (language.isBlank())
            throw new IllegalArgumentException("Language can not be empty");
        return hackerNewFacade.getHackerNewsByLanguage(language);
    }
}
