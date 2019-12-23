package com.yalunwang.summer;

public class HelloWorldService {

    private String myName;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void sayHello(){
        System.out.println("hi:"+myName);
    }
}
