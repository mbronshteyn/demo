package com.mbronshteyn.heapdump;

import java.util.ArrayList;
import java.util.List;

public class A {
    public void generateDump(){
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < 1000; i++) {
            list.add(new char[1000000]);
        }
    }
}
