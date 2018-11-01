package com.wzy.admin;

/**
 * Created by wzy on 2018/11/2 7:47
 **/
public class test {


    public int t1(int i){
        i=i+5;
        return i;
    }

    public static void main(String args[]){
        int a=5;

        new test().t1(a);
        System.out.println(a);
    }
}
