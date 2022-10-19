package com.airtel.service;

import com.airtel.model.message_alerts.CustomerMessage;
import org.springframework.http.ResponseEntity;

public interface IWhatsappService {

    ResponseEntity verifyToken(String mode,String token,String challenge);
    void messageAlert(CustomerMessage message);
    ResponseEntity sendMessage(String msisdn);

}
