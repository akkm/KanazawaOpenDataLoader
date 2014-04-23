package com.akkuma.kanazawa.loader.entity.response;

import java.util.List;

import com.akkuma.kanazawa.loader.entity.Genre;

public class GenresListResponse implements ResponseEntityInterface {
    List<Genre> genres;

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
    
}
