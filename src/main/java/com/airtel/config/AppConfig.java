package com.airtel.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class AppConfig {

    @Value("${verify.token}")
    private String verifyToken;

    @Value("${access.token}")
    private String accessToken;

    @Value("${mode}")
    private String mode;

    @Value("${whatsapp.api.url}")
    private String whatsappUlr;

    public AppConfig() {
    }

}
