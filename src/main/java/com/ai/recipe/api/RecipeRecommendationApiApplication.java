package com.ai.recipe.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RecipeRecommendationApiApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(RecipeRecommendationApiApplication.class, args);
    }
}