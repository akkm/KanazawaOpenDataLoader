package com.akkuma.kanazawa.loader.test;

import java.io.IOException;

import com.akkuma.kanazawa.loader.core.KanazawaOpenDataApiLoader;
import com.akkuma.kanazawa.loader.entity.Genre;
import com.akkuma.kanazawa.loader.entity.request.GenresListRequest;
import com.akkuma.kanazawa.loader.entity.response.GenresListResponse;
import com.akkuma.kanazawa.loader.param.LangParam;

class Test {
    public static void main(String[] args) {
        
        KanazawaOpenDataApiLoader aa = new KanazawaOpenDataApiLoader();
        
        GenresListRequest req = new GenresListRequest();
        
        req.setLang(LangParam.EN);
        
        try {
            GenresListResponse gen = aa.load(req);
            
            for (Genre g : gen.getGenres()) {
                
                System.out.println(g.getName());
                
                
                
            }
            
            
            
            
            
            
            
            
            
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        
        
        
        
        
        
        
        
    }
}
