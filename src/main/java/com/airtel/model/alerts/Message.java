
package com.airtel.model.alerts;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Message {

    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("text")
    @Expose
    private Text text;
    @SerializedName("type")
    @Expose
    private String type;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
