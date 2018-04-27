package com.paysera.sdk.wallet.entities.transfer;

public class Password {

    private String type;
    private String value;

    public Password(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public Password() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
