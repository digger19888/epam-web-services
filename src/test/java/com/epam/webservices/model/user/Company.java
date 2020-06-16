package com.epam.webservices.model.user;


import java.util.HashMap;
import java.util.Map;

public class Company {

    private String name;
    private String catchPhrase;
    private String bs;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

}
