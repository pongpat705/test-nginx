package com.maoz.testnginx;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

    @RequestMapping(value = "/")
    public Map<String, Object> index(HttpServletRequest request){
        Map<String, Object> x = new HashMap<>();
        x.put("status", 200);
        Enumeration<String> headers = request.getHeaderNames();
        while (headers.hasMoreElements()){
            String k = headers.nextElement();
            x.put(k, request.getHeader(k));
        }

        return x;
    }
}
