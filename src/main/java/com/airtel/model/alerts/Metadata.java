
package com.airtel.model.alerts;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Metadata {

    @SerializedName("display_phone_number")
    @Expose
    @JsonProperty("display_phone_number")
    private String displayPhoneNumber;
    @SerializedName("phone_number_id")
    @Expose
    @JsonProperty("phone_number_id")
    private String phoneNumberId;

    public String getDisplayPhoneNumber() {
        return displayPhoneNumber;
    }

    public void setDisplayPhoneNumber(String displayPhoneNumber) {
        this.displayPhoneNumber = displayPhoneNumber;
    }

    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

}
