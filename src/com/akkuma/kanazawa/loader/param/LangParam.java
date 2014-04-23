package com.akkuma.kanazawa.loader.param;

public enum LangParam {
    EN("en"),JA("ja"),ZH_HANS("zh-Hans"),ZH_HANT("zh-Hant"),KO("ko"),FR("fr"),PT("pt"),ES("es");
    
    private String paramString;
    
    private LangParam(String str) {
        paramString = str;
    }

    public String getParamString() {
        return paramString;
    }
    
    @Override
    public String toString() {
        return paramString;
    }
}
