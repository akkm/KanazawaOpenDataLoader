package com.akkuma.kanazawa.loader.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.akkuma.kanazawa.loader.entity.request.RequestEntityInterface;
import com.akkuma.kanazawa.loader.entity.response.ResponseEntityInterface;
import com.google.gson.Gson;

public class KanazawaOpenDataApiLoader<T extends ResponseEntityInterface> {

    @SuppressWarnings("unchecked")
    public T load(RequestEntityInterface req) throws IOException {

        URL url = new URL(req.getRequestUrl());
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        InputStreamReader is = new InputStreamReader(con.getInputStream());
        BufferedReader br = new BufferedReader(is);

        StringBuilder builder = new StringBuilder();
        String str = null;
        while ((str = br.readLine()) != null) {
            builder.append(str);
        }

        Gson gson = new Gson();
        T obj = (T) gson.fromJson(builder.toString(), req.getResponseClass());

        return obj;
    }

}
