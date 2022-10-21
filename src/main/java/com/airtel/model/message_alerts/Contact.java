
package com.airtel.model.message_alerts;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Contact {

    @SerializedName("profile")
    @Expose
    private Profile profile;
    @SerializedName("wa_id")
    @Expose
    @JsonProperty("wa_id")
    private String waId;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getWaId() {
        return waId;
    }

    public void setWaId(String waId) {
        this.waId = waId;
    }

}
