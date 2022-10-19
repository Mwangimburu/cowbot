package com.airtel.service.impl;

import com.airtel.config.AppConfig;
import com.airtel.model.message_alerts.CustomerMessage;
import com.airtel.model.message_response.MessageReponse;
import com.airtel.model.reply.ReplyText;
import com.airtel.model.reply.Text;
import com.airtel.service.IWhatsappService;
import com.airtel.utils.Utils;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WhatsappServiceImpl implements IWhatsappService {
    Logger logger = LoggerFactory.getLogger(WhatsappServiceImpl.class);

    @Autowired
    AppConfig config;


    @Override
    public ResponseEntity verifyToken(String mode, String token, String challenge) {
        if (mode != null && token != null) {
            if (mode == config.getMode() && token == config.getVerifyToken()) {
                return new ResponseEntity<>(challenge,HttpStatus.OK);
            } else {
                return new ResponseEntity<>(challenge,HttpStatus.FORBIDDEN);
            }
        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @Override
    public void messageAlert(CustomerMessage message) {
        String msg = Utils.toJson(message);
        logger.info("Message : {}", msg);
    }

    @Override
    public ResponseEntity sendMessage(String msisdn) {

        String message = "Hi there :)"
                +"\nWelcome to Airtel Bot";

        ReplyText reply = new ReplyText();

        Text text = new Text();

        reply.setMessagingProduct("whatsapp");
        reply.setRecipientType("individual");
        reply.setTo(msisdn);
        reply.setType("text");

        text.setPreviewUrl(false);
        text.setBody(message);

        reply.setText(text);

        MediaType mediaType = MediaType.parse("application/json");
        String json = Utils.toJson(reply);

        logger.info("Request data : {}", json);

        RequestBody body = RequestBody.create(mediaType, json);

        String token = "Bearer "+ config.getAccessToken();


        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", token);
        headers.put("Content-Type", "application/json");

        ResponseEntity response = Utils.sendRequest(body, headers, config.getWhatsappUlr(), "POST");
        if (response.getStatusCode().equals(HttpStatus.OK)){
            String res = Utils.toJson(response);

            logger.info("Response : {}", res);
        }else {
            String res = Utils.toJson(response);
            logger.info("{}",res);
        }

        return response;
    }

}
