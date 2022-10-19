package com.airtel.controller;

import com.airtel.model.message_alerts.CustomerMessage;
import com.airtel.service.IWhatsappService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApplicationController {

    Logger logger = LoggerFactory.getLogger(ApplicationController.class);
    @Autowired
    private IWhatsappService  whatsappService;

    @RequestMapping(path = "/webhook", method = RequestMethod.GET)
    public ResponseEntity verify(HttpServletRequest request){

        String mode = request.getParameter("hub.mode");
        String token = request.getParameter("hub.verify_token");
        String challenge = request.getParameter("hub.challenge");

        logger.info("mode : {} : token : {} : challenge : {} ",mode,token,challenge);

        return whatsappService.verifyToken(mode,token,challenge);
    }

    @RequestMapping(path = "/webhook", method = RequestMethod.POST)
    public void message(@RequestBody CustomerMessage message){
        whatsappService.messageAlert(message);
    }

    @RequestMapping(path = "/send", method = RequestMethod.GET)
    public void sendText(HttpServletRequest request){
        String msisdn = request.getParameter("msisdn");
        logger.info("msisdn : {}",msisdn);
        whatsappService.sendMessage(msisdn);

    }



}
