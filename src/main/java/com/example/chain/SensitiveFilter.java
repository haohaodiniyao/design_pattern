package com.example.chain;

/**
 * Created by yaokai on 2017/6/16.
 */
public class SensitiveFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace("被就业","就业").replace("敏感","")+"####SensitiveFilter()");
        filterChain.doFilter(request, response,filterChain);
        response.setResponseStr(response.getResponseStr()+"####SensitiveFilter()");
    }
}
