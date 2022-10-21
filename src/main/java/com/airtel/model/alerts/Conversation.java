
package com.airtel.model.alerts;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Conversation {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("expiration_timestamp")
    @Expose
    @JsonProperty("expiration_timestamp")
    private String expirationTimestamp;
    @SerializedName("origin")
    @Expose
    private Origin origin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpirationTimestamp() {
        return expirationTimestamp;
    }

    public void setExpirationTimestamp(String expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

}
