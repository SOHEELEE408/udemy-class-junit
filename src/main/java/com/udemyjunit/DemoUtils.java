package com.udemyjunit;

public class DemoUtils {

    public int add(int a, int b){
        return a+b;
    }

    public Object checkNull(Object obj){
        if(obj != null)
            return obj;

        return null;
    }
}
