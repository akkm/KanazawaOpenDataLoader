package com.akkuma.kanazawa.loader.entity.request;

import com.akkuma.kanazawa.loader.entity.response.FacilitiesSearchResponse;
import com.akkuma.kanazawa.loader.entity.response.ResponseEntityInterface;
import com.akkuma.kanazawa.loader.param.LangParam;

public class FacilitiesSearchRequest implements RequestEntityInterface {

    public static final String BASE_URL = "https://infra-api.city.kanazawa.ishikawa.jp/v1/facilities/search.json";

    private LangParam lang;
    private Geocode geocode;
    private String genre;
    private String keyword;
    private int count;

    @Override
    public String getRequestUrl() {

        StringBuilder builder = new StringBuilder();
        builder.append(BASE_URL);
        builder.append("?");

        if (lang != null) {
            builder.append("lang=");
            builder.append(lang.toString() + "&");
        }

        if (geocode != null) {
            builder.append("geocode=");
            builder.append(geocode.toString() + "&");
        }

        if (genre != null) {
            builder.append("genre=");
            builder.append(genre + "&");
        }

        if (keyword != null) {
            builder.append("keyword=");
            builder.append(keyword + "&");
        }

        if (count != 0) {
            builder.append("count=");
            builder.append(count);
        }

        return builder.toString();
    }

    @Override
    public Class<? extends ResponseEntityInterface> getResponseClass() {
        return FacilitiesSearchResponse.class;
    }

    public LangParam getLang() {
        return lang;
    }

    public void setLang(LangParam lang) {
        this.lang = lang;
    }

    public Geocode getGeocode() {
        return geocode;
    }

    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static class Geocode {
        private double latitude;
        private double longtitude;
        private long radius;

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongtitude() {
            return longtitude;
        }

        public void setLongtitude(double longtitude) {
            this.longtitude = longtitude;
        }

        public long getRadius() {
            return radius;
        }

        public void setRadius(long radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return latitude + "," + longtitude + "," + radius;
        }
    }

}
