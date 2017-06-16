package com.example.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaokai on 2017/6/16.
 */
public class FilterChain implements Filter {
    List<Filter> filterList = new ArrayList<Filter>();
    int index = 0;
    public FilterChain addFilter(Filter filter){
        filterList.add(filter);
        return this;
    }
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if(index == filterList.size()){
            return;
        }
        Filter filter = filterList.get(index);
        index++;
        filter.doFilter(request,response,filterChain);
    }
}
