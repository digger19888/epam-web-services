package com.epam.webservices.model.get;

import java.util.HashMap;
import java.util.Map;

public class Get {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

}
