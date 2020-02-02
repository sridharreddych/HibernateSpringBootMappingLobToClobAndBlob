package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.newAuthor();
            bookstoreService.fetchAuthor();
        };
    }
}
/*	
 * 
 * How To Map To JDBC’s LOB Locators Clob And Blob

Description: This application is an example of mapping to JDBC's LOB locators Clob and Blob.

Key points:

this takes advantage of JDBC driver LOB-specific optimizations
 * 
 */
