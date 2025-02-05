package com.poc.ms_clear_cache.repository;

import reactor.core.publisher.Mono;

public interface AzureAuthRepository {
    Mono<String> getAccessToken();
}