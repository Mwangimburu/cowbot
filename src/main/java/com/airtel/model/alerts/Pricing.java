
package com.airtel.model.alerts;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Pricing {

    @SerializedName("billable")
    @Expose
    private Boolean billable;
    @SerializedName("pricing_model")
    @Expose
    @JsonProperty("pricing_model")
    private String pricingModel;
    @SerializedName("category")
    @Expose
    private String category;

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public String getPricingModel() {
        return pricingModel;
    }

    public void setPricingModel(String pricingModel) {
        this.pricingModel = pricingModel;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
