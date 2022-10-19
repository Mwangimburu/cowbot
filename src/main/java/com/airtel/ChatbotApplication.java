package com.airtel;

import com.airtel.service.IWhatsappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatbotApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ChatbotApplication.class, args);
    }

    @Autowired
    IWhatsappService whatsappService;

    @Override
    public void run(String... args) throws Exception {
        //whatsappService.sendMessage("254786633655");
    }
}
