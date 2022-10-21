
package com.airtel.model.alerts;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Value {

    @SerializedName("messaging_product")
    @Expose
    @JsonProperty("messaging_product")
    private String messagingProduct;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("contacts")
    @Expose
    private List<Contact> contacts = null;
    @SerializedName("messages")
    @Expose
    private List<Message> messages = null;
    @SerializedName("statuses")
    @Expose
    private List<Status> statuses = null;

    public String getMessagingProduct() {
        return messagingProduct;
    }

    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
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

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

}
