package com.mbronshteyn.service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by mbronshteyn on 4/25/17.
 */
public class Test {
    public static void main( String[] args ){
        test();
        return;
    }

    private static void test() {
        String[] a =  { "a", "b", "c" };
        List<String> list = Arrays.asList( a );
        int count = list.size();
        List<Integer> integers = Arrays.asList(count);
        System.out.println( integers.toString());
    }
}
