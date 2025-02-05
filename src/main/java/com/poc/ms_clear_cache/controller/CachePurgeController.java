package com.poc.ms_clear_cache.controller;

import com.poc.ms_clear_cache.model.PurgeRequest;
import com.poc.ms_clear_cache.service.CachePurgeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/cache")
@RequiredArgsConstructor
public class CachePurgeController {
    private final CachePurgeService cachePurgeService;

    @PostMapping("/purge")
    public Mono<Void> purgeCache(@RequestBody PurgeRequest request) {
        return cachePurgeService.purgeCache(request.getContentPaths());
    }
}