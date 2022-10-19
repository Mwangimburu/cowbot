
package com.airtel.model.reply;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Text {

    @SerializedName("preview_url")
    @Expose
    @JsonProperty("preview_url")
    private Boolean previewUrl;
    @SerializedName("body")
    @Expose
    @JsonProperty("body")
    private String body;

    public Boolean getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(Boolean previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
