package com.challenge.ingerencia.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
class HackerNewServiceTest {

    @Autowired
    private HackerNewService service;

    @Test
    void test_ok_call_java() {
        Map<String, Object> result = service.getHackerNewsByLanguage("java");

        assertThat((List<?>) result.get("hits")).isNotEmpty();
    }

    @Test
    void test_ok_call_not_hits() {
        Map<String, Object> result = service.getHackerNewsByLanguage("othertestswithoutresult");

        assertThat((List<?>) result.get("hits")).isEmpty();
    }

    @Test
    void test_invalid_param() {
        assertThatThrownBy(() -> service.getHackerNewsByLanguage(""))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}