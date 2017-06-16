package com.example.chain;

/**
 * Created by yaokai on 2017/6/16.
 */
public class HTMLFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        //将字符串中出现的"<>"符号替换成"[]"
        request.setRequestStr(request.getRequestStr().replace('<', '[').replace('>', ']')+"####HTMLFilter()");
        filterChain.doFilter(request, response,filterChain);
        response.setResponseStr(response.getResponseStr()+"####HTMLFilter()");
    }
}
