package me.sonam;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    //@Bean
    GroupedOpenApi myGroup() {
        return GroupedOpenApi.builder().group("myapi")
                .pathsToMatch("/v3/api-docs")
                .build();
    }
}
