package com.challenge.ingerencia.feign.hackernew;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name="hackernew", url="${externalServer.url}")
public interface HackerNewClient {

    @RequestMapping(method = RequestMethod.GET, value = "/search_by_date")
    Map<String,Object> getByLanguage(@RequestParam String query);
}
