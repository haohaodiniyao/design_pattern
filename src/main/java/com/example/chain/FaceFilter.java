package com.example.chain;

/**
 * Created by yaokai on 2017/6/16.
 */
public class FaceFilter implements Filter{
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.setRequestStr(request.getRequestStr().replace(":):","^V^")+"####FaceFilter()");
        filterChain.doFilter(request,response,filterChain);
        response.setResponseStr(response.getResponseStr()+"####FaceFilter()");
    }
}
