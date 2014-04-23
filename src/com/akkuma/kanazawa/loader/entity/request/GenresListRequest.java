package com.akkuma.kanazawa.loader.entity.request;

import com.akkuma.kanazawa.loader.entity.response.ResponseEntityInterface;
import com.akkuma.kanazawa.loader.entity.response.GenresListResponse;
import com.akkuma.kanazawa.loader.param.LangParam;

public class GenresListRequest implements RequestEntityInterface {

    public static final String BASE_URL = "https://infra-api.city.kanazawa.ishikawa.jp/v1/genres/list.json";

    private LangParam lang;

    public LangParam getLang() {
        return lang;
    }

    public void setLang(LangParam lang) {
        this.lang = lang;
    }

    @Override
    public String getRequestUrl() {
        if (lang != null) {
            return BASE_URL + "&lang=" + lang.toString();
        } else {
            return BASE_URL;
        }
    }

    @Override
    public Class<? extends ResponseEntityInterface> getResponseClass() {
        return GenresListResponse.class;
    }

}
