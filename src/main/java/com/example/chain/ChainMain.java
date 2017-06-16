package com.example.chain;

/**
 * Created by yaokai on 2017/6/16.
 */
public class ChainMain {
    public static void main(String[] args){
        String msg = ":):,<script>,敏感,被就业,网络授课";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response:");
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
