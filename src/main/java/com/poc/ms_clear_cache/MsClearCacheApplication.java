package com.poc.ms_clear_cache;

import com.poc.ms_clear_cache.config.AzureProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AzureProperties.class)
public class MsClearCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClearCacheApplication.class, args);
	}

}
