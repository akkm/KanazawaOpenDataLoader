package com.akkuma.kanazawa.loader.entity.request;

import com.akkuma.kanazawa.loader.entity.response.ResponseEntityInterface;

public interface RequestEntityInterface {
    public String getRequestUrl();

    public Class<? extends ResponseEntityInterface> getResponseClass();
}
