package com.msrocco.contentcalendar;

import com.msrocco.contentcalendar.config.ContentCalendarProperties;
import com.msrocco.contentcalendar.model.Content;
import com.msrocco.contentcalendar.model.Status;
import com.msrocco.contentcalendar.model.Type;
import com.msrocco.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
