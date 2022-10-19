
package com.airtel.model.message_response;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class MessageReponse implements Serializable {

    @SerializedName("messaging_product")
    @Expose
    @JsonProperty("messaging_product")
    private String messagingProduct;
    @SerializedName("contacts")
    @Expose
    private List<Contact> contacts = null;
    @SerializedName("messages")
    @Expose
    private List<Message> messages = null;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

}
