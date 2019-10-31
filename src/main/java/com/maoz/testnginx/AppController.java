package com.maoz.testnginx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @RequestMapping(value = "/")
    public Map<String, Object> index(){
        Map<String, Object> x = new HashMap<>();
        x.put("status", 200);

        return x;
    }
}
