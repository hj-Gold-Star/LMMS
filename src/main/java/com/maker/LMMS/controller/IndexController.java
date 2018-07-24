package com.maker.LMMS.controller;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Response;


/**
 * @author : zimu
 * @Date: 2018/7/24 09:47
 * @description :
 */
@Bean
@Path
public class IndexController {
    @GetRoute("/")
    public String index() {
        return "index.html";
    }
    @GetRoute("/index")
    public void index(Response response){
        response.text("hello world!");
    }
}
