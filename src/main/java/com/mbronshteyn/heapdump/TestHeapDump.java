package com.mbronshteyn.heapdump;

/**
 * Heap Dump example.
 * Don't forget to add jvm parameters:
 * -XX:+HeapDumpOnOutOfMemoryError -Xms10m -Xmx1g
 */
public class TestHeapDump {
    public static void main(String[] args) {
       A a =  new A();
       a.generateDump();
    }
}
