package com.itcast.acturtor.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ActurtorAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActurtorAdminApplication.class, args);
    }

}
