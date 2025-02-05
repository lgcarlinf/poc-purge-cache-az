package com.poc.ms_clear_cache.repository;

import reactor.core.publisher.Mono;

import java.util.List;

public interface FrontDoorRepository {
    Mono<Void> purgeCache(List<String> contentPaths);
}