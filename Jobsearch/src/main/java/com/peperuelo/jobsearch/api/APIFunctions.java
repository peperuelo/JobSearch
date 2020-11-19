package com.peperuelo.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {
    static <T> T buildAPI(Class <T> api, String url){
      return Feign.builder()
              .decoder(new GsonDecoder())
              .target(api, url);
    }
}
